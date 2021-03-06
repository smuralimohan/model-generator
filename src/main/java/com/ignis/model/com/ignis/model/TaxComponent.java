package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Date;

/**
 * TaxComponent generated by hbm2java
 */
public class TaxComponent implements java.io.Serializable {

	private long id;
	private Tax tax;
	private String name;
	private Serializable type;
	private Float value;
	private Date startDate;
	private Date endDate;
	private Boolean isActive;
	private Date updatedAt;
	private Long updatedBy;

	public TaxComponent() {
	}

	public TaxComponent(long id) {
		this.id = id;
	}

	public TaxComponent(long id, Tax tax, String name, Serializable type, Float value, Date startDate, Date endDate,
			Boolean isActive, Date updatedAt, Long updatedBy) {
		this.id = id;
		this.tax = tax;
		this.name = name;
		this.type = type;
		this.value = value;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
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

	public Float getValue() {
		return this.value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
