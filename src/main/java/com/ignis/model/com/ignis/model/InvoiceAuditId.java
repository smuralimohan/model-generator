package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * InvoiceAuditId generated by hbm2java
 */
public class InvoiceAuditId implements java.io.Serializable {

	private Character action;
	private Long id;
	private Long sessionId;
	private Float subtotal;
	private Float taxes;
	private Float discounts;
	private Float total;
	private Float paid;
	private Float due;
	private Date updatedAt;
	private Long updatedBy;

	public InvoiceAuditId() {
	}

	public InvoiceAuditId(Character action, Long id, Long sessionId, Float subtotal, Float taxes, Float discounts,
			Float total, Float paid, Float due, Date updatedAt, Long updatedBy) {
		this.action = action;
		this.id = id;
		this.sessionId = sessionId;
		this.subtotal = subtotal;
		this.taxes = taxes;
		this.discounts = discounts;
		this.total = total;
		this.paid = paid;
		this.due = due;
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

	public Long getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public Float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public Float getTaxes() {
		return this.taxes;
	}

	public void setTaxes(Float taxes) {
		this.taxes = taxes;
	}

	public Float getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(Float discounts) {
		this.discounts = discounts;
	}

	public Float getTotal() {
		return this.total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Float getPaid() {
		return this.paid;
	}

	public void setPaid(Float paid) {
		this.paid = paid;
	}

	public Float getDue() {
		return this.due;
	}

	public void setDue(Float due) {
		this.due = due;
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
		if (!(other instanceof InvoiceAuditId))
			return false;
		InvoiceAuditId castOther = (InvoiceAuditId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null
				&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null
						&& this.getId().equals(castOther.getId())))
				&& ((this.getSessionId() == castOther.getSessionId()) || (this.getSessionId() != null
						&& castOther.getSessionId() != null && this.getSessionId().equals(castOther.getSessionId())))
				&& ((this.getSubtotal() == castOther.getSubtotal()) || (this.getSubtotal() != null
						&& castOther.getSubtotal() != null && this.getSubtotal().equals(castOther.getSubtotal())))
				&& ((this.getTaxes() == castOther.getTaxes()) || (this.getTaxes() != null
						&& castOther.getTaxes() != null && this.getTaxes().equals(castOther.getTaxes())))
				&& ((this.getDiscounts() == castOther.getDiscounts()) || (this.getDiscounts() != null
						&& castOther.getDiscounts() != null && this.getDiscounts().equals(castOther.getDiscounts())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getPaid() == castOther.getPaid()) || (this.getPaid() != null && castOther.getPaid() != null
						&& this.getPaid().equals(castOther.getPaid())))
				&& ((this.getDue() == castOther.getDue()) || (this.getDue() != null && castOther.getDue() != null
						&& this.getDue().equals(castOther.getDue())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getSessionId() == null ? 0 : this.getSessionId().hashCode());
		result = 37 * result + (getSubtotal() == null ? 0 : this.getSubtotal().hashCode());
		result = 37 * result + (getTaxes() == null ? 0 : this.getTaxes().hashCode());
		result = 37 * result + (getDiscounts() == null ? 0 : this.getDiscounts().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getPaid() == null ? 0 : this.getPaid().hashCode());
		result = 37 * result + (getDue() == null ? 0 : this.getDue().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		return result;
	}

}
