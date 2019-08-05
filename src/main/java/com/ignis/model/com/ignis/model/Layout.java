package com.ignis.model;
// Generated 4 Aug, 2019 8:15:16 PM by Hibernate Tools 5.4.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Layout generated by hbm2java
 */
public class Layout implements java.io.Serializable {

	private long id;
	private String name;
	private byte[] image;
	private Date updatedAt;
	private Long updatedBy;
	private Set establishments = new HashSet(0);

	public Layout() {
	}

	public Layout(long id) {
		this.id = id;
	}

	public Layout(long id, String name, byte[] image, Date updatedAt, Long updatedBy, Set establishments) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.establishments = establishments;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
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

	public Set getEstablishments() {
		return this.establishments;
	}

	public void setEstablishments(Set establishments) {
		this.establishments = establishments;
	}

}
