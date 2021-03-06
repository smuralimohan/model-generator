package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * TaxEntity generated by hbm2java
 */
public class TaxEntity implements java.io.Serializable {

	private TaxEntityId id;
	private Entity entity;
	private Tax tax;

	public TaxEntity() {
	}

	public TaxEntity(TaxEntityId id) {
		this.id = id;
	}

	public TaxEntity(TaxEntityId id, Entity entity, Tax tax) {
		this.id = id;
		this.entity = entity;
		this.tax = tax;
	}

	public TaxEntityId getId() {
		return this.id;
	}

	public void setId(TaxEntityId id) {
		this.id = id;
	}

	public Entity getEntity() {
		return this.entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
