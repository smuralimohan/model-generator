package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * EstablishmentAuditId generated by hbm2java
 */
public class EstablishmentAuditId implements java.io.Serializable {

	private Character action;
	private long id;
	private Long entityId;
	private Integer establishmentNo;
	private String address;
	private Date updatedAt;
	private Long updatedBy;

	public EstablishmentAuditId() {
	}

	public EstablishmentAuditId(long id) {
		this.id = id;
	}

	public EstablishmentAuditId(Character action, long id, Long entityId, Integer establishmentNo, String address,
			Date updatedAt, Long updatedBy) {
		this.action = action;
		this.id = id;
		this.entityId = entityId;
		this.establishmentNo = establishmentNo;
		this.address = address;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public Character getAction() {
		return this.action;
	}

	public void setAction(Character action) {
		this.action = action;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Integer getEstablishmentNo() {
		return this.establishmentNo;
	}

	public void setEstablishmentNo(Integer establishmentNo) {
		this.establishmentNo = establishmentNo;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstablishmentAuditId))
			return false;
		EstablishmentAuditId castOther = (EstablishmentAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& (this.getId() == castOther.getId())
				&& ((this.getEntityId() == castOther.getEntityId()) || (this.getEntityId() != null
						&& castOther.getEntityId() != null && this.getEntityId().equals(castOther.getEntityId())))
				&& ((this.getEstablishmentNo() == castOther.getEstablishmentNo())
						|| (this.getEstablishmentNo() != null && castOther.getEstablishmentNo() != null
								&& this.getEstablishmentNo().equals(castOther.getEstablishmentNo())))
				&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (int) this.getId();
		result = 37 * result + (getEntityId() == null ? 0 : this.getEntityId().hashCode());
		result = 37 * result + (getEstablishmentNo() == null ? 0 : this.getEstablishmentNo().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
