package com.ignis.model;
// Generated 17 Aug, 2019 12:44:50 AM by Hibernate Tools 5.4.3.Final

/**
 * GeographyColumnsId generated by hbm2java
 */
public class GeographyColumnsId implements java.io.Serializable {

	private String FTableCatalog;
	private String FTableSchema;
	private String FTableName;
	private String FGeographyColumn;
	private Integer coordDimension;
	private Integer srid;
	private String type;

	public GeographyColumnsId() {
	}

	public GeographyColumnsId(String FTableCatalog, String FTableSchema, String FTableName, String FGeographyColumn,
			Integer coordDimension, Integer srid, String type) {
		this.FTableCatalog = FTableCatalog;
		this.FTableSchema = FTableSchema;
		this.FTableName = FTableName;
		this.FGeographyColumn = FGeographyColumn;
		this.coordDimension = coordDimension;
		this.srid = srid;
		this.type = type;
	}

	public String getFTableCatalog() {
		return this.FTableCatalog;
	}

	public void setFTableCatalog(String FTableCatalog) {
		this.FTableCatalog = FTableCatalog;
	}

	public String getFTableSchema() {
		return this.FTableSchema;
	}

	public void setFTableSchema(String FTableSchema) {
		this.FTableSchema = FTableSchema;
	}

	public String getFTableName() {
		return this.FTableName;
	}

	public void setFTableName(String FTableName) {
		this.FTableName = FTableName;
	}

	public String getFGeographyColumn() {
		return this.FGeographyColumn;
	}

	public void setFGeographyColumn(String FGeographyColumn) {
		this.FGeographyColumn = FGeographyColumn;
	}

	public Integer getCoordDimension() {
		return this.coordDimension;
	}

	public void setCoordDimension(Integer coordDimension) {
		this.coordDimension = coordDimension;
	}

	public Integer getSrid() {
		return this.srid;
	}

	public void setSrid(Integer srid) {
		this.srid = srid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GeographyColumnsId))
			return false;
		GeographyColumnsId castOther = (GeographyColumnsId) other;

		return ((this.getFTableCatalog() == castOther.getFTableCatalog())
				|| (this.getFTableCatalog() != null && castOther.getFTableCatalog() != null
						&& this.getFTableCatalog().equals(castOther.getFTableCatalog())))
				&& ((this.getFTableSchema() == castOther.getFTableSchema())
						|| (this.getFTableSchema() != null && castOther.getFTableSchema() != null
								&& this.getFTableSchema().equals(castOther.getFTableSchema())))
				&& ((this.getFTableName() == castOther.getFTableName()) || (this.getFTableName() != null
						&& castOther.getFTableName() != null && this.getFTableName().equals(castOther.getFTableName())))
				&& ((this.getFGeographyColumn() == castOther.getFGeographyColumn())
						|| (this.getFGeographyColumn() != null && castOther.getFGeographyColumn() != null
								&& this.getFGeographyColumn().equals(castOther.getFGeographyColumn())))
				&& ((this.getCoordDimension() == castOther.getCoordDimension())
						|| (this.getCoordDimension() != null && castOther.getCoordDimension() != null
								&& this.getCoordDimension().equals(castOther.getCoordDimension())))
				&& ((this.getSrid() == castOther.getSrid()) || (this.getSrid() != null && castOther.getSrid() != null
						&& this.getSrid().equals(castOther.getSrid())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFTableCatalog() == null ? 0 : this.getFTableCatalog().hashCode());
		result = 37 * result + (getFTableSchema() == null ? 0 : this.getFTableSchema().hashCode());
		result = 37 * result + (getFTableName() == null ? 0 : this.getFTableName().hashCode());
		result = 37 * result + (getFGeographyColumn() == null ? 0 : this.getFGeographyColumn().hashCode());
		result = 37 * result + (getCoordDimension() == null ? 0 : this.getCoordDimension().hashCode());
		result = 37 * result + (getSrid() == null ? 0 : this.getSrid().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}
