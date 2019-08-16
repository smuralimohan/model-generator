package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * Review generated by hbm2java
 */
public class Review implements java.io.Serializable {

	private long id;
	private BarMenuItem barMenuItem;
	private Customer customer;
	private Establishment establishment;
	private KitchenMenuItem kitchenMenuItem;
	private String comments;
	private Integer rating;
	private Date updatedAt;
	private Long updatedBy;

	public Review() {
	}

	public Review(long id, Customer customer, Establishment establishment) {
		this.id = id;
		this.customer = customer;
		this.establishment = establishment;
	}

	public Review(long id, BarMenuItem barMenuItem, Customer customer, Establishment establishment,
			KitchenMenuItem kitchenMenuItem, String comments, Integer rating, Date updatedAt, Long updatedBy) {
		this.id = id;
		this.barMenuItem = barMenuItem;
		this.customer = customer;
		this.establishment = establishment;
		this.kitchenMenuItem = kitchenMenuItem;
		this.comments = comments;
		this.rating = rating;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BarMenuItem getBarMenuItem() {
		return this.barMenuItem;
	}

	public void setBarMenuItem(BarMenuItem barMenuItem) {
		this.barMenuItem = barMenuItem;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Establishment getEstablishment() {
		return this.establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public KitchenMenuItem getKitchenMenuItem() {
		return this.kitchenMenuItem;
	}

	public void setKitchenMenuItem(KitchenMenuItem kitchenMenuItem) {
		this.kitchenMenuItem = kitchenMenuItem;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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