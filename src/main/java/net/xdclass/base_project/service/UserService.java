package net.xdclass.base_project.service;

import net.xdclass.base_project.domain.User;

/**
 * @author hdz
 */
public interface UserService {

	/**
	 * 追加用户
	 * @param user 用户Bean
	 * @return id  用户ID
	 */
	int add(User user);

	//public int addAccount();
}
