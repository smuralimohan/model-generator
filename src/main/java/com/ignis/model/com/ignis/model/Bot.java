package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bot generated by hbm2java
 */
public class Bot implements java.io.Serializable {

	private long id;
	private BarMenuItem barMenuItem;
	private Session session;
	private String qty;
	private Date updatedAt;
	private Long updatedBy;
	private Set invoiceLineItems = new HashSet(0);

	public Bot() {
	}

	public Bot(long id) {
		this.id = id;
	}

	public Bot(long id, BarMenuItem barMenuItem, Session session, String qty, Date updatedAt, Long updatedBy,
			Set invoiceLineItems) {
		this.id = id;
		this.barMenuItem = barMenuItem;
		this.session = session;
		this.qty = qty;
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

	public BarMenuItem getBarMenuItem() {
		return this.barMenuItem;
	}

	public void setBarMenuItem(BarMenuItem barMenuItem) {
		this.barMenuItem = barMenuItem;
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public String getQty() {
		return this.qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
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
