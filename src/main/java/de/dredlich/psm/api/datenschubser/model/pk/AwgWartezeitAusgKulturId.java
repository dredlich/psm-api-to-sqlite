package de.dredlich.psm.api.datenschubser.model.pk;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * AwgWartezeitAusgKulturId generated by hbm2java
 */
@Embeddable
public class AwgWartezeitAusgKulturId implements java.io.Serializable, ICompPK {

	private BigDecimal awgWartezeitNr;
	private String kultur;

	public AwgWartezeitAusgKulturId() {
	}

	public AwgWartezeitAusgKulturId(BigDecimal awgWartezeitNr, String kultur) {
		this.awgWartezeitNr = awgWartezeitNr;
		this.kultur = kultur;
	}

	@Column(name = "AWG_WARTEZEIT_NR", precision = 22, scale = 0)
	public BigDecimal getAwgWartezeitNr() {
		return this.awgWartezeitNr;
	}

	public void setAwgWartezeitNr(BigDecimal awgWartezeitNr) {
		this.awgWartezeitNr = awgWartezeitNr;
	}

	@Column(name = "KULTUR", length = 20)
	public String getKultur() {
		return this.kultur;
	}

	public void setKultur(String kultur) {
		this.kultur = kultur;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AwgWartezeitAusgKulturId))
			return false;
		AwgWartezeitAusgKulturId castOther = (AwgWartezeitAusgKulturId) other;

		return ((this.getAwgWartezeitNr() == castOther.getAwgWartezeitNr())
						|| (this.getAwgWartezeitNr() != null && castOther.getAwgWartezeitNr() != null
								&& this.getAwgWartezeitNr().equals(castOther.getAwgWartezeitNr())))
				&& ((this.getKultur() == castOther.getKultur()) || (this.getKultur() != null
						&& castOther.getKultur() != null && this.getKultur().equals(castOther.getKultur())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAwgWartezeitNr() == null ? 0 : this.getAwgWartezeitNr().hashCode());
		result = 37 * result + (getKultur() == null ? 0 : this.getKultur().hashCode());
		return result;
	}

}