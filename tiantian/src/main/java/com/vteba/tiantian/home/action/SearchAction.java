package com.vteba.tiantian.home.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.tiantian.home.bean.SearchBean;

/**
 * 公共搜索入口控制器。将搜索站内所有的商品。
 * 将基于solr进行索引。
 * 
 * @author yinlei
 * @since 2015年2月28日 下午1:42:30
 */
@Controller
public class SearchAction {
	
	@ResponseBody
	@RequestMapping("/search")
	public List<SearchBean> search(String key) {
		List<SearchBean> result = new ArrayList<>();
		
		return result;
	}
}
