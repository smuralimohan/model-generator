package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

import java.util.Date;

/**
 * InvoiceLineItem generated by hbm2java
 */
public class InvoiceLineItem implements java.io.Serializable {

	private long id;
	private Bot bot;
	private Invoice invoice;
	private Kot kot;
	private Double price;
	private Date updatedAt;
	private Long updatedBy;

	public InvoiceLineItem() {
	}

	public InvoiceLineItem(long id) {
		this.id = id;
	}

	public InvoiceLineItem(long id, Bot bot, Invoice invoice, Kot kot, Double price, Date updatedAt, Long updatedBy) {
		this.id = id;
		this.bot = bot;
		this.invoice = invoice;
		this.kot = kot;
		this.price = price;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Bot getBot() {
		return this.bot;
	}

	public void setBot(Bot bot) {
		this.bot = bot;
	}

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Kot getKot() {
		return this.kot;
	}

	public void setKot(Kot kot) {
		this.kot = kot;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
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
