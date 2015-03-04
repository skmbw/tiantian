package com.vteba.tiantian.item.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.item.model.Item;
import com.vteba.tiantian.item.service.spi.ItemService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 商品控制器
 * @author yinlei
 * @date 2015-3-2 15:20:58
 */
@Controller
@RequestMapping("/item")
public class ItemAction extends GenericAction<Item> {
	@Inject
	private ItemService itemServiceImpl;
	
	/**
     * 获得商品List，初始化列表页。
     * @param model 参数
     * @return 商品List
     */
    @RequestMapping("/initial")
    public String initial(Item model, Map<String, Object> maps) {
        List<Item> list = itemServiceImpl.pagedList(model);
        maps.put("list", list);
        return "item/initial";
    }
	
	/**
	 * 获得商品List，Json格式。
	 * @param model 参数
	 * @return 商品List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Item> list(Item model) {
		List<Item> list = itemServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得商品实体，Json格式。
     * @param id 参数id
     * @return 商品实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Item get(String id) {
        Item model = itemServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "item/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Item model) {
        int result = itemServiceImpl.save(model);
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
     * 查看商品详情页。
     * @param model 查询参数，携带ID
     * @return 商品详情页
     */
    @RequestMapping("/detail")
    public String detail(Item model, Map<String, Object> maps) {
        model = itemServiceImpl.get(model.getItemId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "item/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Item model, Map<String, Object> maps) {
        model = itemServiceImpl.get(model.getItemId());
        maps.put("model", model);
        return "item/edit";
    }
    
    /**
     * 更新商品信息
     * @param model 要更新的商品信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Item model) {
        int result = itemServiceImpl.updateById(model);
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
     * 删除商品信息
     * @param id 要删除的商品ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = itemServiceImpl.deleteById(id);
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
