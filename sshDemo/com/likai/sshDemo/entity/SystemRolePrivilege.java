package com.likai.sshDemo.entity;
// Generated 2016-8-20 13:58:54 by Hibernate Tools 4.3.4.Final

/**
 * SystemRolePrivilege generated by hbm2java
 */
public class SystemRolePrivilege implements java.io.Serializable {

	private Long id;
	private SystemPrivilege systemPrivilege;
	private SystemRole systemRole;
	private Integer isUse;

	public SystemRolePrivilege() {
	}

	public SystemRolePrivilege(SystemPrivilege systemPrivilege, SystemRole systemRole, Integer isUse) {
		this.systemPrivilege = systemPrivilege;
		this.systemRole = systemRole;
		this.isUse = isUse;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SystemPrivilege getSystemPrivilege() {
		return this.systemPrivilege;
	}

	public void setSystemPrivilege(SystemPrivilege systemPrivilege) {
		this.systemPrivilege = systemPrivilege;
	}

	public SystemRole getSystemRole() {
		return this.systemRole;
	}

	public void setSystemRole(SystemRole systemRole) {
		this.systemRole = systemRole;
	}

	public Integer getIsUse() {
		return this.isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

}
