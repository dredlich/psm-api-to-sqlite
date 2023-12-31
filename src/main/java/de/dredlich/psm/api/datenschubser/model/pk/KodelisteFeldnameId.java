package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * KodelisteFeldnameId generated by hbm2java
 */
@Embeddable
public class KodelisteFeldnameId implements java.io.Serializable, ICompPK {

	private Short kodeliste;
	private String tabelle;
	private String feldname;

	public KodelisteFeldnameId() {
	}

	public KodelisteFeldnameId(Short kodeliste, String tabelle, String feldname) {
		this.kodeliste = kodeliste;
		this.tabelle = tabelle;
		this.feldname = feldname;
	}

	@Column(name = "KODELISTE", nullable = false, precision = 3)
	public Short getKodeliste() {
		return this.kodeliste;
	}

	public void setKodeliste(Short kodeliste) {
		this.kodeliste = kodeliste;
	}

	@Column(name = "TABELLE", nullable = false, length = 30)
	public String getTabelle() {
		return this.tabelle;
	}

	public void setTabelle(String tabelle) {
		this.tabelle = tabelle;
	}

	@Column(name = "FELDNAME", nullable = false, length = 30)
	public String getFeldname() {
		return this.feldname;
	}

	public void setFeldname(String feldname) {
		this.feldname = feldname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KodelisteFeldnameId))
			return false;
		KodelisteFeldnameId castOther = (KodelisteFeldnameId) other;

		return (this.getKodeliste() == castOther.getKodeliste())
				&& ((this.getTabelle() == castOther.getTabelle()) || (this.getTabelle() != null
						&& castOther.getTabelle() != null && this.getTabelle().equals(castOther.getTabelle())))
				&& ((this.getFeldname() == castOther.getFeldname()) || (this.getFeldname() != null
						&& castOther.getFeldname() != null && this.getFeldname().equals(castOther.getFeldname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getKodeliste();
		result = 37 * result + (getTabelle() == null ? 0 : this.getTabelle().hashCode());
		result = 37 * result + (getFeldname() == null ? 0 : this.getFeldname().hashCode());
		return result;
	}

}
