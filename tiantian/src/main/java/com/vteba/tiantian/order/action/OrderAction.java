package com.vteba.tiantian.order.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.order.model.Order;
import com.vteba.tiantian.order.service.spi.OrderService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 订单控制器
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Controller
@RequestMapping("/order")
public class OrderAction extends GenericAction<Order> {
	@Inject
	private OrderService orderServiceImpl;
	
	/**
     * 获得订单List，初始化列表页。
     * @param model 参数
     * @return 订单List
     */
    @RequestMapping("/initial")
    public String initial(Order model, Map<String, Object> maps) {
        List<Order> list = orderServiceImpl.pagedList(model);
        maps.put("list", list);
        return "order/initial";
    }
	
	/**
	 * 获得订单List，Json格式。
	 * @param model 参数
	 * @return 订单List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Order> list(Order model) {
		List<Order> list = orderServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得订单实体，Json格式。
     * @param id 参数id
     * @return 订单实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Order get(String id) {
        Order model = orderServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "order/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Order model) {
        int result = orderServiceImpl.save(model);
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
     * 查看订单详情页。
     * @param model 查询参数，携带ID
     * @return 订单详情页
     */
    @RequestMapping("/detail")
    public String detail(Order model, Map<String, Object> maps) {
        model = orderServiceImpl.get(model.getOrderId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "order/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Order model, Map<String, Object> maps) {
        model = orderServiceImpl.get(model.getOrderId());
        maps.put("model", model);
        return "order/edit";
    }
    
    /**
     * 更新订单信息
     * @param model 要更新的订单信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Order model) {
        int result = orderServiceImpl.updateById(model);
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
     * 删除订单信息
     * @param id 要删除的订单ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = orderServiceImpl.deleteById(id);
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
