package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * EstablishmentLayout generated by hbm2java
 */
public class EstablishmentLayout implements java.io.Serializable {

	private EstablishmentLayoutId id;
	private Establishment establishment;
	private Layout layout;

	public EstablishmentLayout() {
	}

	public EstablishmentLayout(EstablishmentLayoutId id) {
		this.id = id;
	}

	public EstablishmentLayout(EstablishmentLayoutId id, Establishment establishment, Layout layout) {
		this.id = id;
		this.establishment = establishment;
		this.layout = layout;
	}

	public EstablishmentLayoutId getId() {
		return this.id;
	}

	public void setId(EstablishmentLayoutId id) {
		this.id = id;
	}

	public Establishment getEstablishment() {
		return this.establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Layout getLayout() {
		return this.layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

}
