package com.ignis.model;
// Generated 4 Aug, 2019 8:15:16 PM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * BusinessOwnerEntityId generated by hbm2java
 */
public class BusinessOwnerEntityId implements java.io.Serializable {

	private long entityId;
	private long ownerId;
	private Date updatedAt;
	private Long updatedBy;

	public BusinessOwnerEntityId() {
	}

	public BusinessOwnerEntityId(long entityId, long ownerId) {
		this.entityId = entityId;
		this.ownerId = ownerId;
	}

	public BusinessOwnerEntityId(long entityId, long ownerId, Date updatedAt, Long updatedBy) {
		this.entityId = entityId;
		this.ownerId = ownerId;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
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
		if (!(other instanceof BusinessOwnerEntityId))
			return false;
		BusinessOwnerEntityId castOther = (BusinessOwnerEntityId) other;

		return (this.getEntityId() == castOther.getEntityId()) && (this.getOwnerId() == castOther.getOwnerId())
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getEntityId();
		result = 37 * result + (int) this.getOwnerId();
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
