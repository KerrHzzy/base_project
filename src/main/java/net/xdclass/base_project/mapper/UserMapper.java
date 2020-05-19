package net.xdclass.base_project.mapper;

import net.xdclass.base_project.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 功能描述：访问数据库的接口
 * @author hdz
 */
public interface UserMapper {

	/**
	 * 推荐使用#{}取值，不要用${},因为存在注入的风险
	 * keyProperty java对象的属性；keyColumn表示数据库的字段
	 * @param user 用户bean
	 */
	@Insert("INSERT INTO user(name, phone, create_time, age) VALUES(#{name}, #{phone}, #{createTime}, #{age})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	void insert(User user);

	/**
	 * 查找所有用户信息
	 * @return List<User> 用户信息List
	 */
	@Select("SELECT * FROM user")
	@Results({
			@Result(column = "create_time",property = "createTime")  //javaType = java.util.Date.class
	})
	List<User> getAll();

	/**
	 * 通过用户ID查找用户信息
	 * @param id    用户ID
	 * @return User 用户Bean
	 */
	@Select("SELECT * FROM user WHERE id = #{id}")
	@Results({
			@Result(column = "create_time",property = "createTime")
	})
	User findById(Long id);

	/**
	 * 通过用户ID更新用户名称
	 * @param user 用户信息
	 */
	@Update("UPDATE user SET name=#{name} WHERE id =#{id}")
	void update(User user);

	/**
	 * 删除用户
	 * @param userId 用户ID
	 */
	@Delete("DELETE FROM user WHERE id =#{userId}")
	void delete(Long userId);

	/**
	 * 删除所有用户
	 */
	@Delete("DELETE FROM user")
	void deleteAll();
}