package com.ignis.model;
// Generated 4 Aug, 2019 8:15:16 PM by Hibernate Tools 5.4.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BusinessOwner generated by hbm2java
 */
public class BusinessOwner implements java.io.Serializable {

	private long id;
	private String username;
	private String passhash;
	private String firstName;
	private String lastName;
	private String address;
	private Date updatedAt;
	private Long updatedBy;
	private Set businessOwnerEntities = new HashSet(0);

	public BusinessOwner() {
	}

	public BusinessOwner(long id) {
		this.id = id;
	}

	public BusinessOwner(long id, String username, String passhash, String firstName, String lastName, String address,
			Date updatedAt, Long updatedBy, Set businessOwnerEntities) {
		this.id = id;
		this.username = username;
		this.passhash = passhash;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.businessOwnerEntities = businessOwnerEntities;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasshash() {
		return this.passhash;
	}

	public void setPasshash(String passhash) {
		this.passhash = passhash;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Set getBusinessOwnerEntities() {
		return this.businessOwnerEntities;
	}

	public void setBusinessOwnerEntities(Set businessOwnerEntities) {
		this.businessOwnerEntities = businessOwnerEntities;
	}

}