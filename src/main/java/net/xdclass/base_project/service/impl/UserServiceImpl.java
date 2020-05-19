package net.xdclass.base_project.service.impl;

import java.util.Date;

import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

	/**
	 * 追加用户账号
	 * @return int 用户ID
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addAccount() {

		User user = new User();
		user.setAge(88);
		user.setCreateTime(new Date());
		user.setName("测试事务啦加入事务");
		user.setPhone("10010101010");
		userMapper.insert(user);

		int i = 19/0;

		return 0;
	}
}
