package com.vteba.tiantian.home.action;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器。这里的数据主要来自缓存。不会读取数据库。提高首页的相应速度。
 * 
 * @author yinlei
 * @since 2015年2月28日 下午1:43:33
 */
@Controller
public class IndexAction {

	@RequestMapping("/index")
	public String index(Map<String, Object> params, HttpServletResponse response) {
		
		return "home/index";
	}
}
