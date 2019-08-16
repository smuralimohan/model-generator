package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BarMenuItem generated by hbm2java
 */
public class BarMenuItem implements java.io.Serializable {

	private long id;
	private BarMenu barMenu;
	private Currency currency;
	private String name;
	private Serializable price;
	private String description;
	private Serializable itemType;
	private Serializable itemSubtype;
	private Date updatedAt;
	private Long updatedBy;
	private Set reviews = new HashSet(0);
	private Set bots = new HashSet(0);

	public BarMenuItem() {
	}

	public BarMenuItem(long id) {
		this.id = id;
	}

	public BarMenuItem(long id, BarMenu barMenu, Currency currency, String name, Serializable price, String description,
			Serializable itemType, Serializable itemSubtype, Date updatedAt, Long updatedBy, Set reviews, Set bots) {
		this.id = id;
		this.barMenu = barMenu;
		this.currency = currency;
		this.name = name;
		this.price = price;
		this.description = description;
		this.itemType = itemType;
		this.itemSubtype = itemSubtype;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.reviews = reviews;
		this.bots = bots;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BarMenu getBarMenu() {
		return this.barMenu;
	}

	public void setBarMenu(BarMenu barMenu) {
		this.barMenu = barMenu;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Serializable getPrice() {
		return this.price;
	}

	public void setPrice(Serializable price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Serializable getItemType() {
		return this.itemType;
	}

	public void setItemType(Serializable itemType) {
		this.itemType = itemType;
	}

	public Serializable getItemSubtype() {
		return this.itemSubtype;
	}

	public void setItemSubtype(Serializable itemSubtype) {
		this.itemSubtype = itemSubtype;
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

	public Set getReviews() {
		return this.reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

	public Set getBots() {
		return this.bots;
	}

	public void setBots(Set bots) {
		this.bots = bots;
	}

}