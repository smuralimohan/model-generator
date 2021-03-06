package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Date;

/**
 * BarMenuItemAuditId generated by hbm2java
 */
public class BarMenuItemAuditId implements java.io.Serializable {

	private Character action;
	private Long id;
	private Long menuId;
	private String name;
	private String currency;
	private Serializable price;
	private String description;
	private Serializable itemType;
	private Serializable itemSubtype;
	private Date updatedAt;
	private Long updatedBy;

	public BarMenuItemAuditId() {
	}

	public BarMenuItemAuditId(Character action, Long id, Long menuId, String name, String currency, Serializable price,
			String description, Serializable itemType, Serializable itemSubtype, Date updatedAt, Long updatedBy) {
		this.action = action;
		this.id = id;
		this.menuId = menuId;
		this.name = name;
		this.currency = currency;
		this.price = price;
		this.description = description;
		this.itemType = itemType;
		this.itemSubtype = itemSubtype;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public Character getAction() {
		return this.action;
	}

	public void setAction(Character action) {
		this.action = action;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BarMenuItemAuditId))
			return false;
		BarMenuItemAuditId castOther = (BarMenuItemAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null
						&& this.getId().equals(castOther.getId())))
				&& ((this.getMenuId() == castOther.getMenuId()) || (this.getMenuId() != null
						&& castOther.getMenuId() != null && this.getMenuId().equals(castOther.getMenuId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getCurrency() == castOther.getCurrency()) || (this.getCurrency() != null
						&& castOther.getCurrency() != null && this.getCurrency().equals(castOther.getCurrency())))
				&& ((this.getPrice() == castOther.getPrice()) || (this.getPrice() != null
						&& castOther.getPrice() != null && this.getPrice().equals(castOther.getPrice())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getItemType() == castOther.getItemType()) || (this.getItemType() != null
						&& castOther.getItemType() != null && this.getItemType().equals(castOther.getItemType())))
				&& ((this.getItemSubtype() == castOther.getItemSubtype())
						|| (this.getItemSubtype() != null && castOther.getItemSubtype() != null
								&& this.getItemSubtype().equals(castOther.getItemSubtype())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getMenuId() == null ? 0 : this.getMenuId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getCurrency() == null ? 0 : this.getCurrency().hashCode());
		result = 37 * result + (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getItemType() == null ? 0 : this.getItemType().hashCode());
		result = 37 * result + (getItemSubtype() == null ? 0 : this.getItemSubtype().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
