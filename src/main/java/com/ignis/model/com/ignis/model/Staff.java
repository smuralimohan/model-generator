package com.ignis.model;
// Generated 4 Aug, 2019 8:15:16 PM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * Staff generated by hbm2java
 */
public class Staff implements java.io.Serializable {

	private long id;
	private Establishment establishment;
	private String username;
	private String passhash;
	private String firstName;
	private String lastName;
	private String address;
	private Date updatedAt;
	private Long updatedBy;

	public Staff() {
	}

	public Staff(long id, Establishment establishment) {
		this.id = id;
		this.establishment = establishment;
	}

	public Staff(long id, Establishment establishment, String username, String passhash, String firstName,
			String lastName, String address, Date updatedAt, Long updatedBy) {
		this.id = id;
		this.establishment = establishment;
		this.username = username;
		this.passhash = passhash;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
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

}
