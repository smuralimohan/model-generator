package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * BookingHistory generated by hbm2java
 */
public class BookingHistory implements java.io.Serializable {

	private BookingHistoryId id;

	public BookingHistory() {
	}

	public BookingHistory(BookingHistoryId id) {
		this.id = id;
	}

	public BookingHistoryId getId() {
		return this.id;
	}

	public void setId(BookingHistoryId id) {
		this.id = id;
	}

}
