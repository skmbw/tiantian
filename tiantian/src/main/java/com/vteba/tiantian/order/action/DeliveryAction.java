package com.vteba.tiantian.order.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.order.model.Delivery;
import com.vteba.tiantian.order.service.spi.DeliveryService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 配送信息控制器
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Controller
@RequestMapping("/delivery")
public class DeliveryAction extends GenericAction<Delivery> {
	@Inject
	private DeliveryService deliveryServiceImpl;
	
	/**
     * 获得配送信息List，初始化列表页。
     * @param model 参数
     * @return 配送信息List
     */
    @RequestMapping("/initial")
    public String initial(Delivery model, Map<String, Object> maps) {
        List<Delivery> list = deliveryServiceImpl.pagedList(model);
        maps.put("list", list);
        return "delivery/initial";
    }
	
	/**
	 * 获得配送信息List，Json格式。
	 * @param model 参数
	 * @return 配送信息List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Delivery> list(Delivery model) {
		List<Delivery> list = deliveryServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得配送信息实体，Json格式。
     * @param id 参数id
     * @return 配送信息实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Delivery get(String id) {
        Delivery model = deliveryServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "delivery/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Delivery model) {
        int result = deliveryServiceImpl.save(model);
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
     * 查看配送信息详情页。
     * @param model 查询参数，携带ID
     * @return 配送信息详情页
     */
    @RequestMapping("/detail")
    public String detail(Delivery model, Map<String, Object> maps) {
        model = deliveryServiceImpl.get(model.getDeliveryId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "delivery/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Delivery model, Map<String, Object> maps) {
        model = deliveryServiceImpl.get(model.getDeliveryId());
        maps.put("model", model);
        return "delivery/edit";
    }
    
    /**
     * 更新配送信息信息
     * @param model 要更新的配送信息信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Delivery model) {
        int result = deliveryServiceImpl.updateById(model);
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
     * 删除配送信息信息
     * @param id 要删除的配送信息ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = deliveryServiceImpl.deleteById(id);
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
