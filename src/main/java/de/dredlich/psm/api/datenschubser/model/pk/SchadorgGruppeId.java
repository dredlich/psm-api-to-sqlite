package de.dredlich.psm.api.datenschubser.model.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * SchadorgGruppeId generated by hbm2java
 */
@Embeddable
public class SchadorgGruppeId implements java.io.Serializable, ICompPK {

	private String schadorgGruppe;
	private String schadorg;

	public SchadorgGruppeId() {
	}

	public SchadorgGruppeId(String schadorgGruppe, String schadorg) {
		this.schadorgGruppe = schadorgGruppe;
		this.schadorg = schadorg;
	}

	@Column(name = "SCHADORG_GRUPPE", nullable = false, length = 20)
	public String getSchadorgGruppe() {
		return this.schadorgGruppe;
	}

	public void setSchadorgGruppe(String schadorgGruppe) {
		this.schadorgGruppe = schadorgGruppe;
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
		if (!(other instanceof SchadorgGruppeId))
			return false;
		SchadorgGruppeId castOther = (SchadorgGruppeId) other;

		return ((this.getSchadorgGruppe() == castOther.getSchadorgGruppe())
				|| (this.getSchadorgGruppe() != null && castOther.getSchadorgGruppe() != null
						&& this.getSchadorgGruppe().equals(castOther.getSchadorgGruppe())))
				&& ((this.getSchadorg() == castOther.getSchadorg()) || (this.getSchadorg() != null
						&& castOther.getSchadorg() != null && this.getSchadorg().equals(castOther.getSchadorg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSchadorgGruppe() == null ? 0 : this.getSchadorgGruppe().hashCode());
		result = 37 * result + (getSchadorg() == null ? 0 : this.getSchadorg().hashCode());
		return result;
	}

}
