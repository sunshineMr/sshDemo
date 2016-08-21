package com.likai.sshDemo.entity;
// Generated 2016-8-20 13:58:54 by Hibernate Tools 4.3.4.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SystemPrivilege generated by hbm2java
 */
public class SystemPrivilege implements java.io.Serializable {

	private Long id;
	private SystemPrivilege systemPrivilege;
	private String name;
	private String url;
	private String icon;
	private Date createTime;
	private Integer sort;
	private Integer type;
	private Set<SystemPrivilege> systemPrivileges = new HashSet<SystemPrivilege>(0);
	private Set<SystemRolePrivilege> systemRolePrivileges = new HashSet<SystemRolePrivilege>(0);

	public SystemPrivilege() {
	}

	public SystemPrivilege(SystemPrivilege systemPrivilege, String name, String url, String icon, Date createTime,
			Integer sort, Integer type, Set<SystemPrivilege> systemPrivileges,
			Set<SystemRolePrivilege> systemRolePrivileges) {
		this.systemPrivilege = systemPrivilege;
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.createTime = createTime;
		this.sort = sort;
		this.type = type;
		this.systemPrivileges = systemPrivileges;
		this.systemRolePrivileges = systemRolePrivileges;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Set<SystemPrivilege> getSystemPrivileges() {
		return this.systemPrivileges;
	}

	public void setSystemPrivileges(Set<SystemPrivilege> systemPrivileges) {
		this.systemPrivileges = systemPrivileges;
	}

	public Set<SystemRolePrivilege> getSystemRolePrivileges() {
		return this.systemRolePrivileges;
	}

	public void setSystemRolePrivileges(Set<SystemRolePrivilege> systemRolePrivileges) {
		this.systemRolePrivileges = systemRolePrivileges;
	}

}