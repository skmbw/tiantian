package com.vteba.tiantian.user.service.spi;

import com.vteba.tiantian.user.model.User;

/**
 * 基于Cookies的服务。
 * @author yinlei
 * @date 2013-8-26 下午1:47:44
 */
public interface CookieService {
	
	/**
	 * 将验证码存入Cookie。
	 * @param authCode 验证码
	 * @return true或false
	 */
	public boolean addAuthCodeToCookie(String authCode);

	/**
	 * 从Cookie获取验证码密文
	 * @return 验证码密文
	 */
	public String getAuthCodeFromCookie();

	/**
	 * 验证码是否有效。
	 * @param encodeAuthCode 密文验证码
	 * @param rawAuthCode 明文验证码
	 * @return true是，false否
	 */
	public boolean isAuthCodeValid(String encodeAuthCode, String rawAuthCode);

	/**
	 * 验证码是否有效。
	 * @param authCode 用户输入的验证码
	 * @return true是，false否
	 */
	public boolean isAuthCodeValid(String authCode);

	/**
	 * 将用户信息存入Cookie。信息使用DES对称加密。如果存在多个账户的登录信息，那么覆盖它。
	 * @param user 用户信息
	 */
	public void addUserToCookie(User user);

	/**
	 * 从Cookie中获取当前登录用户信息。相当于从HttpSession中获取用户信息。
	 * @return 用户信息
	 */
	public User getUserFromCookie();

	/**
	 * 获取当前登录用户信息。
	 * @return 用户信息
	 */
	public User getCurrentUser();

	/**
	 * 用户是否登录。从Cookie中校验。
	 * @return true是，false否
	 */
	public boolean isUserLogin();

	/**
	 * 用户登出，失效登录信息Cookie。
	 * @return true or false
	 */
	public boolean logout();
	
	
}
