package com.vteba.tiantian.user.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.user.model.Address;
import com.vteba.tiantian.user.service.spi.AddressService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 用户地址控制器
 * @author yinlei
 * @date 2015-3-2 15:19:20
 */
@Controller
@RequestMapping("/address")
public class AddressAction extends GenericAction<Address> {
	@Inject
	private AddressService addressServiceImpl;
	
	/**
     * 获得用户地址List，初始化列表页。
     * @param model 参数
     * @return 用户地址List
     */
    @RequestMapping("/initial")
    public String initial(Address model, Map<String, Object> maps) {
        List<Address> list = addressServiceImpl.pagedList(model);
        maps.put("list", list);
        return "address/initial";
    }
	
	/**
	 * 获得用户地址List，Json格式。
	 * @param model 参数
	 * @return 用户地址List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Address> list(Address model) {
		List<Address> list = addressServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得用户地址实体，Json格式。
     * @param id 参数id
     * @return 用户地址实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Address get(String id) {
        Address model = addressServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "address/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Address model) {
        int result = addressServiceImpl.save(model);
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
     * 查看用户地址详情页。
     * @param model 查询参数，携带ID
     * @return 用户地址详情页
     */
    @RequestMapping("/detail")
    public String detail(Address model, Map<String, Object> maps) {
        model = addressServiceImpl.get(model.getAddressId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "address/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Address model, Map<String, Object> maps) {
        model = addressServiceImpl.get(model.getAddressId());
        maps.put("model", model);
        return "address/edit";
    }
    
    /**
     * 更新用户地址信息
     * @param model 要更新的用户地址信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Address model) {
        int result = addressServiceImpl.updateById(model);
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
     * 删除用户地址信息
     * @param id 要删除的用户地址ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = addressServiceImpl.deleteById(id);
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
