package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Arrays;
import java.util.Date;

/**
 * LayoutAuditId generated by hbm2java
 */
public class LayoutAuditId implements java.io.Serializable {

	private Character action;
	private long id;
	private String name;
	private byte[] image;
	private Date updatedAt;
	private Long updatedBy;

	public LayoutAuditId() {
	}

	public LayoutAuditId(long id) {
		this.id = id;
	}

	public LayoutAuditId(Character action, long id, String name, byte[] image, Date updatedAt, Long updatedBy) {
		this.action = action;
		this.id = id;
		this.name = name;
		this.image = image;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
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
		if (!(other instanceof LayoutAuditId))
			return false;
		LayoutAuditId castOther = (LayoutAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& (this.getId() == castOther.getId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getImage() == castOther.getImage()) || (this.getImage() != null
						&& castOther.getImage() != null && Arrays.equals(this.getImage(), castOther.getImage())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (int) this.getId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		int imageHashcode = 0;
		byte[] imageProperty = this.getImage();
		if (imageProperty != null) {
			imageHashcode = 1;
			for (int i = 0; i < imageProperty.length; i++) {
				imageHashcode = 37 * imageHashcode + imageProperty[i];
			}
		}

		result = 37 * result + imageHashcode;

		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
