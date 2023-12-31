package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * AwgPartnerAufwandId generated by hbm2java
 */
@Embeddable
public class AwgPartnerAufwandId implements java.io.Serializable, ICompPK {

	private String awgId;
	private String partnerKennr;
	private String aufwandbedingung;

	public AwgPartnerAufwandId() {
	}

	public AwgPartnerAufwandId(String awgId, String partnerKennr, String aufwandbedingung) {
		this.awgId = awgId;
		this.partnerKennr = partnerKennr;
		this.aufwandbedingung = aufwandbedingung;
	}

	@Column(name = "AWG_ID", nullable = false, length = 16)
	public String getAwgId() {
		return this.awgId;
	}

	public void setAwgId(String awgId) {
		this.awgId = awgId;
	}

	@Column(name = "PARTNER_KENNR", nullable = false, length = 9)
	public String getPartnerKennr() {
		return this.partnerKennr;
	}

	public void setPartnerKennr(String partnerKennr) {
		this.partnerKennr = partnerKennr;
	}

	@Column(name = "AUFWANDBEDINGUNG", nullable = false, length = 20)
	public String getAufwandbedingung() {
		return this.aufwandbedingung;
	}

	public void setAufwandbedingung(String aufwandbedingung) {
		this.aufwandbedingung = aufwandbedingung;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AwgPartnerAufwandId))
			return false;
		AwgPartnerAufwandId castOther = (AwgPartnerAufwandId) other;

		return ((this.getAwgId() == castOther.getAwgId()) || (this.getAwgId() != null && castOther.getAwgId() != null
				&& this.getAwgId().equals(castOther.getAwgId())))
				&& ((this.getPartnerKennr() == castOther.getPartnerKennr())
						|| (this.getPartnerKennr() != null && castOther.getPartnerKennr() != null
								&& this.getPartnerKennr().equals(castOther.getPartnerKennr())))
				&& ((this.getAufwandbedingung() == castOther.getAufwandbedingung())
						|| (this.getAufwandbedingung() != null && castOther.getAufwandbedingung() != null
								&& this.getAufwandbedingung().equals(castOther.getAufwandbedingung())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAwgId() == null ? 0 : this.getAwgId().hashCode());
		result = 37 * result + (getPartnerKennr() == null ? 0 : this.getPartnerKennr().hashCode());
		result = 37 * result + (getAufwandbedingung() == null ? 0 : this.getAufwandbedingung().hashCode());
		return result;
	}

}
