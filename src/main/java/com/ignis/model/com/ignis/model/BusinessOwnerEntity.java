package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * BusinessOwnerEntity generated by hbm2java
 */
public class BusinessOwnerEntity implements java.io.Serializable {

	private BusinessOwnerEntityId id;
	private BusinessOwner businessOwner;
	private Entity entity;

	public BusinessOwnerEntity() {
	}

	public BusinessOwnerEntity(BusinessOwnerEntityId id, BusinessOwner businessOwner, Entity entity) {
		this.id = id;
		this.businessOwner = businessOwner;
		this.entity = entity;
	}

	public BusinessOwnerEntityId getId() {
		return this.id;
	}

	public void setId(BusinessOwnerEntityId id) {
		this.id = id;
	}

	public BusinessOwner getBusinessOwner() {
		return this.businessOwner;
	}

	public void setBusinessOwner(BusinessOwner businessOwner) {
		this.businessOwner = businessOwner;
	}

	public Entity getEntity() {
		return this.entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
