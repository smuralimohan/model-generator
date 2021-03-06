package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * SysconfigCustom generated by hbm2java
 */
public class SysconfigCustom implements java.io.Serializable {

	private int id;
	private Entity entity;
	private Sysconfig sysconfig;
	private String name;
	private Boolean boolValue;
	private Integer intValue;
	private String charValue;
	private Float realValue;
	private Date updatedAt;
	private Long updatedBy;

	public SysconfigCustom() {
	}

	public SysconfigCustom(int id, String name, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.updatedAt = updatedAt;
	}

	public SysconfigCustom(int id, Entity entity, Sysconfig sysconfig, String name, Boolean boolValue, Integer intValue,
			String charValue, Float realValue, Date updatedAt, Long updatedBy) {
		this.id = id;
		this.entity = entity;
		this.sysconfig = sysconfig;
		this.name = name;
		this.boolValue = boolValue;
		this.intValue = intValue;
		this.charValue = charValue;
		this.realValue = realValue;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Entity getEntity() {
		return this.entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public Sysconfig getSysconfig() {
		return this.sysconfig;
	}

	public void setSysconfig(Sysconfig sysconfig) {
		this.sysconfig = sysconfig;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getBoolValue() {
		return this.boolValue;
	}

	public void setBoolValue(Boolean boolValue) {
		this.boolValue = boolValue;
	}

	public Integer getIntValue() {
		return this.intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public String getCharValue() {
		return this.charValue;
	}

	public void setCharValue(String charValue) {
		this.charValue = charValue;
	}

	public Float getRealValue() {
		return this.realValue;
	}

	public void setRealValue(Float realValue) {
		this.realValue = realValue;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

}
