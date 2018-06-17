package com.hqizcc.store.model;

import com.hqizcc.store.model.base.BaseModel;

public class User extends BaseModel {

	private String userName;	// 用户名
	private String loginName;	// 登录名，昵称
	private Integer age;		// 年龄
	private Integer sex;		// 性别 1男 0女
	private String mobile;		// 手机号
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
