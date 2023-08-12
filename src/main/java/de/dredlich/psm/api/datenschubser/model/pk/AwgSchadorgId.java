package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * AwgSchadorgId generated by hbm2java
 */
@Embeddable
public class AwgSchadorgId implements java.io.Serializable, ICompPK {

	private String awgId;
	private String schadorg;

	public AwgSchadorgId() {
	}

	public AwgSchadorgId(String awgId, String schadorg) {
		this.awgId = awgId;
		this.schadorg = schadorg;
	}

	@Column(name = "AWG_ID", nullable = false, length = 16)
	public String getAwgId() {
		return this.awgId;
	}

	public void setAwgId(String awgId) {
		this.awgId = awgId;
	}

	@Column(name = "SCHADORG", nullable = false, length = 20)
	public String getSchadorg() {
		return this.schadorg;
	}

	public void setSchadorg(String schadorg) {
		this.schadorg = schadorg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AwgSchadorgId))
			return false;
		AwgSchadorgId castOther = (AwgSchadorgId) other;

		return ((this.getAwgId() == castOther.getAwgId()) || (this.getAwgId() != null && castOther.getAwgId() != null
				&& this.getAwgId().equals(castOther.getAwgId())))
				&& ((this.getSchadorg() == castOther.getSchadorg()) || (this.getSchadorg() != null
						&& castOther.getSchadorg() != null && this.getSchadorg().equals(castOther.getSchadorg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAwgId() == null ? 0 : this.getAwgId().hashCode());
		result = 37 * result + (getSchadorg() == null ? 0 : this.getSchadorg().hashCode());
		return result;
	}

}