package com.vteba.tiantian.order.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.order.model.ShoppingCart;
import com.vteba.tiantian.order.service.spi.ShoppingCartService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 购物车控制器
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartAction extends GenericAction<ShoppingCart> {
	@Inject
	private ShoppingCartService shoppingCartServiceImpl;
	
	/**
     * 获得购物车List，初始化列表页。
     * @param model 参数
     * @return 购物车List
     */
    @RequestMapping("/initial")
    public String initial(ShoppingCart model, Map<String, Object> maps) {
        List<ShoppingCart> list = shoppingCartServiceImpl.pagedList(model);
        maps.put("list", list);
        return "shoppingCart/initial";
    }
	
	/**
	 * 获得购物车List，Json格式。
	 * @param model 参数
	 * @return 购物车List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<ShoppingCart> list(ShoppingCart model) {
		List<ShoppingCart> list = shoppingCartServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得购物车实体，Json格式。
     * @param id 参数id
     * @return 购物车实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public ShoppingCart get(String id) {
        ShoppingCart model = shoppingCartServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "shoppingCart/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(ShoppingCart model) {
        int result = shoppingCartServiceImpl.save(model);
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
     * 查看购物车详情页。
     * @param model 查询参数，携带ID
     * @return 购物车详情页
     */
    @RequestMapping("/detail")
    public String detail(ShoppingCart model, Map<String, Object> maps) {
        model = shoppingCartServiceImpl.get(model.getItemId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "shoppingCart/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(ShoppingCart model, Map<String, Object> maps) {
        model = shoppingCartServiceImpl.get(model.getItemId());
        maps.put("model", model);
        return "shoppingCart/edit";
    }
    
    /**
     * 更新购物车信息
     * @param model 要更新的购物车信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(ShoppingCart model) {
        int result = shoppingCartServiceImpl.updateById(model);
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
     * 删除购物车信息
     * @param id 要删除的购物车ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = shoppingCartServiceImpl.deleteById(id);
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
