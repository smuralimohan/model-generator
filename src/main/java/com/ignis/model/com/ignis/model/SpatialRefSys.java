package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * SpatialRefSys generated by hbm2java
 */
public class SpatialRefSys implements java.io.Serializable {

	private int srid;
	private String authName;
	private Integer authSrid;
	private String srtext;
	private String proj4text;

	public SpatialRefSys() {
	}

	public SpatialRefSys(int srid) {
		this.srid = srid;
	}

	public SpatialRefSys(int srid, String authName, Integer authSrid, String srtext, String proj4text) {
		this.srid = srid;
		this.authName = authName;
		this.authSrid = authSrid;
		this.srtext = srtext;
		this.proj4text = proj4text;
	}

	public int getSrid() {
		return this.srid;
	}

	public void setSrid(int srid) {
		this.srid = srid;
	}

	public String getAuthName() {
		return this.authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public Integer getAuthSrid() {
		return this.authSrid;
	}

	public void setAuthSrid(Integer authSrid) {
		this.authSrid = authSrid;
	}

	public String getSrtext() {
		return this.srtext;
	}

	public void setSrtext(String srtext) {
		this.srtext = srtext;
	}

	public String getProj4text() {
		return this.proj4text;
	}

	public void setProj4text(String proj4text) {
		this.proj4text = proj4text;
	}

}