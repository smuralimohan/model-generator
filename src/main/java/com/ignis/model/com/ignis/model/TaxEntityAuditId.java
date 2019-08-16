package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * TaxEntityAuditId generated by hbm2java
 */
public class TaxEntityAuditId implements java.io.Serializable {

	private Character action;
	private Long taxId;
	private Long entityId;
	private Date startDate;
	private Date endDate;
	private Boolean isActive;
	private Date updatedAt;
	private Long updatedBy;

	public TaxEntityAuditId() {
	}

	public TaxEntityAuditId(Character action, Long taxId, Long entityId, Date startDate, Date endDate, Boolean isActive,
			Date updatedAt, Long updatedBy) {
		this.action = action;
		this.taxId = taxId;
		this.entityId = entityId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public Character getAction() {
		return this.action;
	}

	public void setAction(Character action) {
		this.action = action;
	}

	public Long getTaxId() {
		return this.taxId;
	}

	public void setTaxId(Long taxId) {
		this.taxId = taxId;
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TaxEntityAuditId))
			return false;
		TaxEntityAuditId castOther = (TaxEntityAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getTaxId() == castOther.getTaxId()) || (this.getTaxId() != null
						&& castOther.getTaxId() != null && this.getTaxId().equals(castOther.getTaxId())))
				&& ((this.getEntityId() == castOther.getEntityId()) || (this.getEntityId() != null
						&& castOther.getEntityId() != null && this.getEntityId().equals(castOther.getEntityId())))
				&& ((this.getStartDate() == castOther.getStartDate()) || (this.getStartDate() != null
						&& castOther.getStartDate() != null && this.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this.getEndDate() != null
						&& castOther.getEndDate() != null && this.getEndDate().equals(castOther.getEndDate())))
				&& ((this.getIsActive() == castOther.getIsActive()) || (this.getIsActive() != null
						&& castOther.getIsActive() != null && this.getIsActive().equals(castOther.getIsActive())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getTaxId() == null ? 0 : this.getTaxId().hashCode());
		result = 37 * result + (getEntityId() == null ? 0 : this.getEntityId().hashCode());
		result = 37 * result + (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37 * result + (getEndDate() == null ? 0 : this.getEndDate().hashCode());
		result = 37 * result + (getIsActive() == null ? 0 : this.getIsActive().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
