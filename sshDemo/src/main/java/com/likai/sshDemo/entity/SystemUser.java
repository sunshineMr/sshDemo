package com.likai.sshDemo.entity;
// Generated 2016-8-20 13:58:54 by Hibernate Tools 4.3.4.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SystemUser generated by hbm2java
 */
public class SystemUser implements java.io.Serializable {

	private Long id;
	private String loginName;
	private String password;
	private String name;
	private String gender;
	private Date birthday;
	private String phone;
	private Date createTime;
	private Integer isUse;
	private Set<SystemUserRole> systemUserRoles = new HashSet<SystemUserRole>(0);

	public SystemUser() {
	}

	public SystemUser(String loginName, String password, String name, String gender, Date birthday, String phone,
			Date createTime, Integer isUse, Set<SystemUserRole> systemUserRoles) {
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.createTime = createTime;
		this.isUse = isUse;
		this.systemUserRoles = systemUserRoles;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsUse() {
		return this.isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

	public Set<SystemUserRole> getSystemUserRoles() {
		return this.systemUserRoles;
	}

	public void setSystemUserRoles(Set<SystemUserRole> systemUserRoles) {
		this.systemUserRoles = systemUserRoles;
	}

}
