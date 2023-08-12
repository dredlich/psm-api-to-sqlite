package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * AuflageReduId generated by hbm2java
 */
@Embeddable
public class AuflageReduId implements java.io.Serializable, ICompPK {

	@Column(name = "AUFLAGENR", nullable = false, precision = 22)
	private Long auflagenr;

	@Column(name = "REDU_ABSTAND", length = 5)
	private String kategorie;

	@Column(name = "KATEGORIE", nullable = false, length = 20)
	private String reduAbstand;

	public AuflageReduId() {}

	public AuflageReduId(Long auflagenr, String kategorie) {
		this.auflagenr = auflagenr;
		this.kategorie = kategorie;
	}

	public AuflageReduId(Long auflagenr, String kategorie, String reduAbstand) {
		this.auflagenr = auflagenr;
		this.kategorie = kategorie;
		this.reduAbstand = reduAbstand;
	}


	public Long getAuflagenr() {
		return this.auflagenr;
	}

	public void setAuflagenr(Long auflagenr) {
		this.auflagenr = auflagenr;
	}

	public String getKategorie() {
		return this.kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	public String getReduAbstand() {
		return this.reduAbstand;
	}

	public void setReduAbstand(String reduAbstand) {
		this.reduAbstand = reduAbstand;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuflageReduId))
			return false;
		AuflageReduId castOther = (AuflageReduId) other;

		return ((this.getAuflagenr() == castOther.getAuflagenr()) || (this.getAuflagenr() != null
						&& castOther.getAuflagenr() != null && this.getAuflagenr().equals(castOther.getAuflagenr())))
				&& ((this.getKategorie() == castOther.getKategorie()) || (this.getKategorie() != null
						&& castOther.getKategorie() != null && this.getKategorie().equals(castOther.getKategorie())))
				&& ((this.getReduAbstand() == castOther.getReduAbstand())
						|| (this.getReduAbstand() != null && castOther.getReduAbstand() != null
								&& this.getReduAbstand().equals(castOther.getReduAbstand())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAuflagenr() == null ? 0 : this.getAuflagenr().hashCode());
		result = 37 * result + (getKategorie() == null ? 0 : this.getKategorie().hashCode());
		result = 37 * result + (getReduAbstand() == null ? 0 : this.getReduAbstand().hashCode());
		return result;
	}

}
