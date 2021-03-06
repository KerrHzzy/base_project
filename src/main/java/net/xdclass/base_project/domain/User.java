package net.xdclass.base_project.domain;

import java.util.Date;

/**
 * @author hdz
 */
public class User {

	private int id;
	private String name;
	private String phone;
	private int age;
	private Date createTime;

	public User() {
	}

	public User(int age, String name, String phone, Date createTime) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
