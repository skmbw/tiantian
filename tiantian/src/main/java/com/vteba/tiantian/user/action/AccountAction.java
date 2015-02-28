package com.vteba.tiantian.user.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.user.model.Account;
import com.vteba.tiantian.user.service.spi.AccountService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 我的账户控制器
 * @author yinlei
 * @date 2015-2-28 17:35:22
 */
@Controller
@RequestMapping("/account")
public class AccountAction extends GenericAction<Account> {
	@Inject
	private AccountService accountServiceImpl;
	
	/**
     * 获得我的账户List，初始化列表页。
     * @param model 参数
     * @return 我的账户List
     */
    @RequestMapping("/initial")
    public String initial(Account model, Map<String, Object> maps) {
        List<Account> list = accountServiceImpl.pagedList(model);
        maps.put("list", list);
        return "account/initial";
    }
	
	/**
	 * 获得我的账户List，Json格式。
	 * @param model 参数
	 * @return 我的账户List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Account> list(Account model) {
		List<Account> list = accountServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得我的账户实体，Json格式。
     * @param id 参数id
     * @return 我的账户实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Account get(String id) {
        Account model = accountServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "account/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Account model) {
        int result = accountServiceImpl.save(model);
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
     * 查看我的账户详情页。
     * @param model 查询参数，携带ID
     * @return 我的账户详情页
     */
    @RequestMapping("/detail")
    public String detail(Account model, Map<String, Object> maps) {
        model = accountServiceImpl.get(model.getId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "account/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Account model, Map<String, Object> maps) {
        model = accountServiceImpl.get(model.getId());
        maps.put("model", model);
        return "account/edit";
    }
    
    /**
     * 更新我的账户信息
     * @param model 要更新的我的账户信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Account model) {
        int result = accountServiceImpl.updateById(model);
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
     * 删除我的账户信息
     * @param id 要删除的我的账户ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = accountServiceImpl.deleteById(id);
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
