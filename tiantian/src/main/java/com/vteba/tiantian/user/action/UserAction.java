package com.vteba.tiantian.user.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vteba.web.action.GenericAction;

/**
 * 用户模块Action。包括登录注册，权限等等。
 * 
 * @author yinlei
 * @since 2015年2月28日 上午10:38:31
 */
@Controller
@RequestMapping("/user")
public class UserAction extends GenericAction<Object> {

	@RequestMapping("/init")
	public String init() {
		return "";
	}
}
