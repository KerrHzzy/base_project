package net.xdclass.base_project.controller;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author hdz
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

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

//	@Autowired
//	private UserMapper userMapper;
//	
//	
//	
//	@GetMapping("findAll")
//	public Object findAll(){
//		
//       return JsonData.buildSuccess(userMapper.getAll());
//	}
//	
//	
//	
//	@GetMapping("findById")
//	public Object findById(long id){
//       return JsonData.buildSuccess(userMapper.findById(id));
//	}
//	
//	
//	@GetMapping("del_by_id")
//	public Object delById(long id){
//	userMapper.delete(id);
//       return JsonData.buildSuccess();
//	}
//	
//	@GetMapping("update")
//	public Object update(String name,int id){
//		User user = new User();
//		user.setName(name);
//		user.setId(id);
//		userMapper.update(user);
//	    return JsonData.buildSuccess();
//	}
//	

//	//测试事务
//	@GetMapping("transac")
//	public Object transac(){
//		int id = userService.addAccount();
//	    return JsonData.buildSuccess(id);
//	}
}
