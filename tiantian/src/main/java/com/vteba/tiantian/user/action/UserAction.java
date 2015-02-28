package com.vteba.tiantian.user.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.consts.KeyValue;
import com.vteba.tiantian.user.model.User;
import com.vteba.tiantian.user.service.spi.CookieService;
import com.vteba.tiantian.user.service.spi.UserService;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 用户信息控制器
 * @author yinlei
 * @date 2015-2-28 12:32:33
 */
@Controller
@RequestMapping("/user")
public class UserAction extends GenericAction<User> {
	
	
	@Inject
	private UserService userServiceImpl;
	
	@Inject
	private CookieService cookieServiceImpl;
	
	@Inject
	private ShaPasswordEncoder shaPasswordEncoder;
	
	/**
	 * 跳转到登录页面
	 * @return 登录逻辑视图名
	 */
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/doLogin")
	public String doLogin(User user) {
		// 检查当前是否有登录用户
		if (cookieServiceImpl.isUserLogin()) {
			// 如果有，和用户填写的登录信息进行比较
			User curUser = cookieServiceImpl.getCurrentUser();

			boolean passEqual = passEqual(curUser.getPassword(), user.getPassword());
			if (passEqual && user.getUserAccount().equals(curUser.getUserAccount())) {
				// 如果成功，直接跳转
				return "home/index";
			} else {
				return checkUserLogin(user);
			}
		} else {// 没有登录直接查询数据库，获取用户信息
			return checkUserLogin(user);
		}
    }
    
    /**
     * 验证用户登录。
     * @param user 用户信息
     * @return 返回的视图
     */
    private String checkUserLogin(User user) {
		// 不成功，查询数据库，获取用户信息
    	User query = new User();
    	query.setUserAccount(user.getUserAccount());
		query = userServiceImpl.unique(query);
		// 和用户填写的登录信息进行比较
		if (query != null && passEqual(query.getPassword(), user.getPassword())) {
			// 如果成功，将信息保存到cookie中，跳转
			cookieServiceImpl.addUserToCookie(query);
			return "home/index";
		} else {
			// 不成功，返回登录页面，显示错误
			return "user/login";
		}
    }

    /**
     * 比较密码是否相等
     * @param encodePass 加密密码
     * @param rawPass 原密码
     * @return true相等，false不等
     */
    private boolean passEqual(String encodePass, String rawPass) {
    	boolean passEqual = shaPasswordEncoder.isPasswordValid(encodePass, rawPass, KeyValue.PASS_SALT);
    	return passEqual;
    }
    
    /**
     * 跳转到用户注册页面
     * @return
     */
    @RequestMapping("/register")
    public String register() {
    	return "user/register";
    }
    
    /**
     * 执行注册的业务逻辑。
     * @param regUser 代注册的用户信息
     * @return 
     */
    @RequestMapping("doRegister")
    public String doRegister(User regUser, Map<String, Object> maps) {
    	// 对密码进行sha，不保存原始密码
    	String password = shaPasswordEncoder.encodePassword(regUser.getPassword(), KeyValue.PASS_SALT);
    	regUser.setPassword(password);
    	regUser.setCreateDate(new Date());
    	regUser.setId(ObjectId.get().toString());
    	
    	int result = userServiceImpl.save(regUser);
    	if (result == 1) {
    		return "home/index";
    	} else {
    		maps.put(MSG, "账号注册失败。");
    		return "user/register";
    	}
    }
    
    /**
     * 获得用户信息List，初始化列表页。
     * @param model 参数
     * @return 用户信息List
     */
    @RequestMapping("/initial")
    public String initial(User model, Map<String, Object> maps) {
        List<User> list = userServiceImpl.pagedList(model);
        maps.put("list", list);
        return "user/initial";
    }
	
	/**
	 * 获得用户信息List，Json格式。
	 * @param model 参数
	 * @return 用户信息List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<User> list(User model) {
		List<User> list = userServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得用户信息实体，Json格式。
     * @param id 参数id
     * @return 用户信息实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public User get(String id) {
        User model = userServiceImpl.get(id);
        return model;
    }
    
    /**
     * 查看用户信息详情页。
     * @param model 查询参数，携带ID
     * @return 用户信息详情页
     */
    @RequestMapping("/detail")
    public String detail(User model, Map<String, Object> maps) {
        model = userServiceImpl.get(model.getId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "user/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(User model, Map<String, Object> maps) {
        model = userServiceImpl.get(model.getId());
        maps.put("model", model);
        return "user/edit";
    }
    
    /**
     * 更新用户信息信息
     * @param model 要更新的用户信息信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(User model) {
        int result = userServiceImpl.updateById(model);
        JsonBean bean = new JsonBean();
        if (result == 1) {
            bean.setMessage(SUCCESS);
        } else {
            bean.setCode(1);
            bean.setMessage(ERROR);
        }
        return bean;
    }
    
    /**
     * 删除用户信息信息
     * @param id 要删除的用户信息ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = userServiceImpl.deleteById(id);
        JsonBean bean = new JsonBean();
        if (result == 1) {
            bean.setMessage(SUCCESS);
        } else {
            bean.setCode(1);
            bean.setMessage(ERROR);
        }
        return bean;
    }
}
