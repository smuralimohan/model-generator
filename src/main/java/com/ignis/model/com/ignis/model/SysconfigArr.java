package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SysconfigArr generated by hbm2java
 */
public class SysconfigArr implements java.io.Serializable {

	private int id;
	private String name;
	private Serializable boolValue;
	private Serializable intValue;
	private Serializable charValue;
	private Serializable realValue;
	private Date updatedAt;
	private Long updatedBy;
	private Set sysconfigArrCustoms = new HashSet(0);

	public SysconfigArr() {
	}

	public SysconfigArr(int id, String name, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.updatedAt = updatedAt;
	}

	public SysconfigArr(int id, String name, Serializable boolValue, Serializable intValue, Serializable charValue,
			Serializable realValue, Date updatedAt, Long updatedBy, Set sysconfigArrCustoms) {
		this.id = id;
		this.name = name;
		this.boolValue = boolValue;
		this.intValue = intValue;
		this.charValue = charValue;
		this.realValue = realValue;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.sysconfigArrCustoms = sysconfigArrCustoms;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Serializable getBoolValue() {
		return this.boolValue;
	}

	public void setBoolValue(Serializable boolValue) {
		this.boolValue = boolValue;
	}

	public Serializable getIntValue() {
		return this.intValue;
	}

	public void setIntValue(Serializable intValue) {
		this.intValue = intValue;
	}

	public Serializable getCharValue() {
		return this.charValue;
	}

	public void setCharValue(Serializable charValue) {
		this.charValue = charValue;
	}

	public Serializable getRealValue() {
		return this.realValue;
	}

	public void setRealValue(Serializable realValue) {
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

	public Set getSysconfigArrCustoms() {
		return this.sysconfigArrCustoms;
	}

	public void setSysconfigArrCustoms(Set sysconfigArrCustoms) {
		this.sysconfigArrCustoms = sysconfigArrCustoms;
	}

}
