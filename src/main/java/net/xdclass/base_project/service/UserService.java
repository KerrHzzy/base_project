package net.xdclass.base_project.service;

import net.xdclass.base_project.domain.User;

/**
 * @author hdz
 */
public interface UserService {

	/**
	 * 追加用户
	 * @param user 用户信息
	 * @return id  用户ID
	 */
	int add(User user);

	/**
	 * 追加用户账号
	 * @return int 用户ID
	 */
	int addAccount();
}
