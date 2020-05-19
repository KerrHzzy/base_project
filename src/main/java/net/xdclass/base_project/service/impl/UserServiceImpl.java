package net.xdclass.base_project.service.impl;

import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hdz
 */
@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	 private UserMapper userMapper;
	 
	@Override
	public int add(User user) {
		userMapper.insert(user);
		return user.getId();
	}
}
