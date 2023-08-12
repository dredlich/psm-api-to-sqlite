package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * HinweisId generated by hbm2java
 */
@Embeddable
public class HinweisId implements java.io.Serializable, ICompPK {

	private String ebene;
	private String hinweis;

	public HinweisId() {
	}

	public HinweisId(String ebene, String hinweis) {
		this.ebene = ebene;
		this.hinweis = hinweis;
	}

	@Column(name = "EBENE", nullable = false, length = 16)
	public String getEbene() {
		return this.ebene;
	}

	public void setEbene(String ebene) {
		this.ebene = ebene;
	}

	@Column(name = "HINWEIS", nullable = false, length = 20)
	public String getHinweis() {
		return this.hinweis;
	}

	public void setHinweis(String hinweis) {
		this.hinweis = hinweis;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HinweisId))
			return false;
		HinweisId castOther = (HinweisId) other;

		return ((this.getEbene() == castOther.getEbene()) || (this.getEbene() != null && castOther.getEbene() != null
				&& this.getEbene().equals(castOther.getEbene())))
				&& ((this.getHinweis() == castOther.getHinweis()) || (this.getHinweis() != null
						&& castOther.getHinweis() != null && this.getHinweis().equals(castOther.getHinweis())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEbene() == null ? 0 : this.getEbene().hashCode());
		result = 37 * result + (getHinweis() == null ? 0 : this.getHinweis().hashCode());
		return result;
	}

}