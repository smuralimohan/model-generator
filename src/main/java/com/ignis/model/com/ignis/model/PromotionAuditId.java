package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * PromotionAuditId generated by hbm2java
 */
public class PromotionAuditId implements java.io.Serializable {

	private Character action;
	private Long id;
	private long entityId;
	private Long staffId;
	private String message;
	private byte[] image;
	private Date startDatetime;
	private Date endDatetime;
	private Boolean isActive;
	private Serializable type;
	private Serializable frequency;
	private Date updatedAt;
	private Long updatedBy;

	public PromotionAuditId() {
	}

	public PromotionAuditId(long entityId) {
		this.entityId = entityId;
	}

	public PromotionAuditId(Character action, Long id, long entityId, Long staffId, String message, byte[] image,
			Date startDatetime, Date endDatetime, Boolean isActive, Serializable type, Serializable frequency,
			Date updatedAt, Long updatedBy) {
		this.action = action;
		this.id = id;
		this.entityId = entityId;
		this.staffId = staffId;
		this.message = message;
		this.image = image;
		this.startDatetime = startDatetime;
		this.endDatetime = endDatetime;
		this.isActive = isActive;
		this.type = type;
		this.frequency = frequency;
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

	public long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public Long getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getStartDatetime() {
		return this.startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public Date getEndDatetime() {
		return this.endDatetime;
	}

	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Serializable getType() {
		return this.type;
	}

	public void setType(Serializable type) {
		this.type = type;
	}

	public Serializable getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Serializable frequency) {
		this.frequency = frequency;
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
		if (!(other instanceof PromotionAuditId))
			return false;
		PromotionAuditId castOther = (PromotionAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& (this.getEntityId() == castOther.getEntityId())
				&& ((this.getStaffId() == castOther.getStaffId()) || (this.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId().equals(castOther.getStaffId())))
				&& ((this.getMessage() == castOther.getMessage()) || (this.getMessage() != null
						&& castOther.getMessage() != null && this.getMessage().equals(castOther.getMessage())))
				&& ((this.getImage() == castOther.getImage()) || (this.getImage() != null
						&& castOther.getImage() != null && Arrays.equals(this.getImage(), castOther.getImage())))
				&& ((this.getStartDatetime() == castOther.getStartDatetime())
						|| (this.getStartDatetime() != null && castOther.getStartDatetime() != null
								&& this.getStartDatetime().equals(castOther.getStartDatetime())))
				&& ((this.getEndDatetime() == castOther.getEndDatetime())
						|| (this.getEndDatetime() != null && castOther.getEndDatetime() != null
								&& this.getEndDatetime().equals(castOther.getEndDatetime())))
				&& ((this.getIsActive() == castOther.getIsActive()) || (this.getIsActive() != null
						&& castOther.getIsActive() != null && this.getIsActive().equals(castOther.getIsActive())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())))
				&& ((this.getFrequency() == castOther.getFrequency()) || (this.getFrequency() != null
						&& castOther.getFrequency() != null && this.getFrequency().equals(castOther.getFrequency())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (int) this.getEntityId();
		result = 37 * result + (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		result = 37 * result + (getMessage() == null ? 0 : this.getMessage().hashCode());
		int imageHashcode = 0;
		byte[] imageProperty = this.getImage();
		if (imageProperty != null) {
			imageHashcode = 1;
			for (int i = 0; i < imageProperty.length; i++) {
				imageHashcode = 37 * imageHashcode + imageProperty[i];
			}
		}

		result = 37 * result + imageHashcode;

		result = 37 * result + (getStartDatetime() == null ? 0 : this.getStartDatetime().hashCode());
		result = 37 * result + (getEndDatetime() == null ? 0 : this.getEndDatetime().hashCode());
		result = 37 * result + (getIsActive() == null ? 0 : this.getIsActive().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + (getFrequency() == null ? 0 : this.getFrequency().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}