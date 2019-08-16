package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private long id;
	private String roleName;
	private Long permissions;

	public Role() {
	}

	public Role(long id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}

	public Role(long id, String roleName, Long permissions) {
		this.id = id;
		this.roleName = roleName;
		this.permissions = permissions;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getPermissions() {
		return this.permissions;
	}

	public void setPermissions(Long permissions) {
		this.permissions = permissions;
	}

}
