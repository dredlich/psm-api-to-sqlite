package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * WirkstoffGehaltId generated by hbm2java
 */
@Embeddable
public class WirkstoffGehaltId implements java.io.Serializable, ICompPK {

	private String kennr;
	private String wirknr;
	private String wirkvar;

	public WirkstoffGehaltId() {
	}

	public WirkstoffGehaltId(String kennr, String wirknr, String wirkvar) {
		this.kennr = kennr;
		this.wirknr = wirknr;
		this.wirkvar = wirkvar;
	}

	@Column(name = "KENNR", nullable = false, length = 9)
	public String getKennr() {
		return this.kennr;
	}

	public void setKennr(String kennr) {
		this.kennr = kennr;
	}

	@Column(name = "WIRKNR", nullable = false, length = 4)
	public String getWirknr() {
		return this.wirknr;
	}

	public void setWirknr(String wirknr) {
		this.wirknr = wirknr;
	}

	@Column(name = "WIRKVAR", nullable = false, length = 3)
	public String getWirkvar() {
		return this.wirkvar;
	}

	public void setWirkvar(String wirkvar) {
		this.wirkvar = wirkvar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WirkstoffGehaltId))
			return false;
		WirkstoffGehaltId castOther = (WirkstoffGehaltId) other;

		return ((this.getKennr() == castOther.getKennr()) || (this.getKennr() != null && castOther.getKennr() != null
				&& this.getKennr().equals(castOther.getKennr())))
				&& ((this.getWirknr() == castOther.getWirknr()) || (this.getWirknr() != null
						&& castOther.getWirknr() != null && this.getWirknr().equals(castOther.getWirknr())))
				&& ((this.getWirkvar() == castOther.getWirkvar()) || (this.getWirkvar() != null
						&& castOther.getWirkvar() != null && this.getWirkvar().equals(castOther.getWirkvar())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getKennr() == null ? 0 : this.getKennr().hashCode());
		result = 37 * result + (getWirknr() == null ? 0 : this.getWirknr().hashCode());
		result = 37 * result + (getWirkvar() == null ? 0 : this.getWirkvar().hashCode());
		return result;
	}

}