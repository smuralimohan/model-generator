package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * KitchenMenu generated by hbm2java
 */
public class KitchenMenu implements java.io.Serializable {

	private long id;
	private Establishment establishment;
	private String name;
	private Serializable type;
	private Date updatedAt;
	private Long updatedBy;
	private Set kitchenMenuItems = new HashSet(0);

	public KitchenMenu() {
	}

	public KitchenMenu(long id) {
		this.id = id;
	}

	public KitchenMenu(long id, Establishment establishment, String name, Serializable type, Date updatedAt,
			Long updatedBy, Set kitchenMenuItems) {
		this.id = id;
		this.establishment = establishment;
		this.name = name;
		this.type = type;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.kitchenMenuItems = kitchenMenuItems;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Establishment getEstablishment() {
		return this.establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Serializable getType() {
		return this.type;
	}

	public void setType(Serializable type) {
		this.type = type;
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

	public Set getKitchenMenuItems() {
		return this.kitchenMenuItems;
	}

	public void setKitchenMenuItems(Set kitchenMenuItems) {
		this.kitchenMenuItems = kitchenMenuItems;
	}

}
