package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Invoice generated by hbm2java
 */
public class Invoice implements java.io.Serializable {

	private long id;
	private Session session;
	private Float subtotal;
	private Float taxes;
	private Float discounts;
	private Float total;
	private Float paid;
	private Float due;
	private Date updatedAt;
	private Long updatedBy;
	private Set invoiceLineItems = new HashSet(0);

	public Invoice() {
	}

	public Invoice(long id) {
		this.id = id;
	}

	public Invoice(long id, Session session, Float subtotal, Float taxes, Float discounts, Float total, Float paid,
			Float due, Date updatedAt, Long updatedBy, Set invoiceLineItems) {
		this.id = id;
		this.session = session;
		this.subtotal = subtotal;
		this.taxes = taxes;
		this.discounts = discounts;
		this.total = total;
		this.paid = paid;
		this.due = due;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.invoiceLineItems = invoiceLineItems;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
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

	public Set getInvoiceLineItems() {
		return this.invoiceLineItems;
	}

	public void setInvoiceLineItems(Set invoiceLineItems) {
		this.invoiceLineItems = invoiceLineItems;
	}

}