package com.ignis.model;
// Generated 4 Aug, 2019 8:15:16 PM by Hibernate Tools 5.4.3.Final

/**
 * EntityAudit generated by hbm2java
 */
public class EntityAudit implements java.io.Serializable {

	private EntityAuditId id;

	public EntityAudit() {
	}

	public EntityAudit(EntityAuditId id) {
		this.id = id;
	}

	public EntityAuditId getId() {
		return this.id;
	}

	public void setId(EntityAuditId id) {
		this.id = id;
	}

}
