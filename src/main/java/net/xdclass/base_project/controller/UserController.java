package net.xdclass.base_project.controller;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;
import net.xdclass.base_project.task.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

/**
 * @author hdz
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	/**
	 * 功能描述: user 保存接口
	 * @return JsonData
	 */
	@GetMapping("add")
	public Object add(){

		User user = new User();
		user.setAge(11);
		user.setCreateTime(new Date());
		user.setName("xdclass");
		user.setPhone("10010000");
		int id = userService.add(user);

		return JsonData.buildSuccess(id);
	}

	@Autowired
	private UserMapper userMapper;

	/**
	 * 查找所有用户信息
	 * @return JsonData
	 */
	@GetMapping("find_all")
	public Object findAll() {

		return JsonData.buildSuccess(userMapper.getAll());
	}

	/**
	 * 通过ID查找用户
	 * @param id 用户ID
	 * @return JsonData
	 */
	@GetMapping("find_by_Id")
	public Object findById(long id) {

		return JsonData.buildSuccess(userMapper.findById(id));
	}

	/**
	 * 通过ID删除用户
	 * @param id 用户ID
	 * @return JsonData
	 */
	@GetMapping("del_by_id")
	public Object delById(long id) {

		userMapper.delete(id);
		return JsonData.buildSuccess();
	}

	/**
	 * 删除所有用户
	 * @return JsonData
	 */
	@GetMapping("del_all")
	public Object delAll() {

		userMapper.deleteAll();
		return JsonData.buildSuccess();
	}

	/**
	 * 更新指定用户名称
	 * @param id 用户ID
	 * @return JsonData
	 */
	@GetMapping("update")
	public Object update(String name, int id) {

		User user = new User();
		user.setName(name);
		user.setId(id);
		userMapper.update(user);
		return JsonData.buildSuccess();
	}

	/**
	 * 测试事务
	 * @return JsonData
	 */
	@GetMapping("add_account")
	public Object addAccount() {

		int id = userService.addAccount();
		return JsonData.buildSuccess(id);
	}

	@Autowired
	private AsyncTask task;

	@GetMapping("async_task")
	public JsonData exeTask() throws InterruptedException{

		long begin = System.currentTimeMillis();

		/*task.task1();
		task.task2();
		task.task3();*/

		Future<String> task4 = task.task4();
		Future<String> task5 = task.task5();
		Future<String> task6 = task.task6();
		for(;;){
			if (task4.isDone() && task5.isDone() && task6.isDone()) {
				break;
			}
		}

		long end = System.currentTimeMillis();

		long total = end-begin;
		System.out.println("执行总耗时="+total);
		return JsonData.buildSuccess(total);
	}

	/**
	* @author hdz
	* @Description 打印各种级别Log(debug、info、warn、error)
	* @Date 14:39 2020/05/19
	* @return JsonData
	**/
	@GetMapping("log")
	public Object testLog(){

		logger.debug("this is debug level");
		logger.info("this is info level ");
		logger.warn("this is warn level ");
		logger.error("this is error level");
		return JsonData.buildSuccess();
	}
}
