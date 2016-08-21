package com.likai.sshDemo.entity;
// Generated 2016-8-20 13:58:54 by Hibernate Tools 4.3.4.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SystemRole generated by hbm2java
 */
public class SystemRole implements java.io.Serializable {

	private Long id;
	private String name;
	private String description;
	private Date createTime;
	private Integer isUse;
	private Set<SystemRolePrivilege> systemRolePrivileges = new HashSet<SystemRolePrivilege>(0);
	private Set<SystemUserRole> systemUserRoles = new HashSet<SystemUserRole>(0);

	public SystemRole() {
	}

	public SystemRole(String name, String description, Date createTime, Integer isUse,
			Set<SystemRolePrivilege> systemRolePrivileges, Set<SystemUserRole> systemUserRoles) {
		this.name = name;
		this.description = description;
		this.createTime = createTime;
		this.isUse = isUse;
		this.systemRolePrivileges = systemRolePrivileges;
		this.systemUserRoles = systemUserRoles;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Set<SystemRolePrivilege> getSystemRolePrivileges() {
		return this.systemRolePrivileges;
	}

	public void setSystemRolePrivileges(Set<SystemRolePrivilege> systemRolePrivileges) {
		this.systemRolePrivileges = systemRolePrivileges;
	}

	public Set<SystemUserRole> getSystemUserRoles() {
		return this.systemUserRoles;
	}

	public void setSystemUserRoles(Set<SystemUserRole> systemUserRoles) {
		this.systemUserRoles = systemUserRoles;
	}

}