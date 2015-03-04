package com.vteba.tiantian.order.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.order.model.OrderDetail;
import com.vteba.tiantian.order.service.spi.OrderDetailService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 订单明细控制器
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Controller
@RequestMapping("/orderDetail")
public class OrderDetailAction extends GenericAction<OrderDetail> {
	@Inject
	private OrderDetailService orderDetailServiceImpl;
	
	/**
     * 获得订单明细List，初始化列表页。
     * @param model 参数
     * @return 订单明细List
     */
    @RequestMapping("/initial")
    public String initial(OrderDetail model, Map<String, Object> maps) {
        List<OrderDetail> list = orderDetailServiceImpl.pagedList(model);
        maps.put("list", list);
        return "orderDetail/initial";
    }
	
	/**
	 * 获得订单明细List，Json格式。
	 * @param model 参数
	 * @return 订单明细List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<OrderDetail> list(OrderDetail model) {
		List<OrderDetail> list = orderDetailServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得订单明细实体，Json格式。
     * @param id 参数id
     * @return 订单明细实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public OrderDetail get(String id) {
        OrderDetail model = orderDetailServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "orderDetail/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(OrderDetail model) {
        int result = orderDetailServiceImpl.save(model);
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
     * 查看订单明细详情页。
     * @param model 查询参数，携带ID
     * @return 订单明细详情页
     */
    @RequestMapping("/detail")
    public String detail(OrderDetail model, Map<String, Object> maps) {
        model = orderDetailServiceImpl.get(model.getOrderDetailId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "orderDetail/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(OrderDetail model, Map<String, Object> maps) {
        model = orderDetailServiceImpl.get(model.getOrderDetailId());
        maps.put("model", model);
        return "orderDetail/edit";
    }
    
    /**
     * 更新订单明细信息
     * @param model 要更新的订单明细信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(OrderDetail model) {
        int result = orderDetailServiceImpl.updateById(model);
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
     * 删除订单明细信息
     * @param id 要删除的订单明细ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = orderDetailServiceImpl.deleteById(id);
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
