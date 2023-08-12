package de.dredlich.psm.api.datenschubser.model;

import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import de.dredlich.psm.api.datenschubser.model.pk.WirkstoffGehaltId;
import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * WirkstoffGehalt generated by hbm2java
 */
@Entity
@Table(name = "WIRKSTOFF_GEHALT")
public class WirkstoffGehalt implements java.io.Serializable, ISetItemPK {

	private WirkstoffGehaltId id;
	private BigDecimal gehaltRein;
	private BigDecimal gehaltReinGrundstruktur;
	private String gehaltEinheit;
	private Double gehaltBio;
	private String gehaltBioEinheit;

	public WirkstoffGehalt() {
	}

	public WirkstoffGehalt(WirkstoffGehaltId id) {
		this.id = id;
	}

	public WirkstoffGehalt(WirkstoffGehaltId id, BigDecimal gehaltRein,
			BigDecimal gehaltReinGrundstruktur, String gehaltEinheit, Double gehaltBio, String gehaltBioEinheit) {
		this.id = id;
		this.gehaltRein = gehaltRein;
		this.gehaltReinGrundstruktur = gehaltReinGrundstruktur;
		this.gehaltEinheit = gehaltEinheit;
		this.gehaltBio = gehaltBio;
		this.gehaltBioEinheit = gehaltBioEinheit;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "kennr", column = @Column(name = "KENNR", nullable = false, length = 9)),
			@AttributeOverride(name = "wirknr", column = @Column(name = "WIRKNR", nullable = false, length = 4)),
			@AttributeOverride(name = "wirkvar", column = @Column(name = "WIRKVAR", nullable = false, length = 3)) })
	public WirkstoffGehaltId getId() {
		return this.id;
	}

	public void setId(WirkstoffGehaltId id) {
		this.id = id;
	}

	@Override
	public void setID(ICompPK id) {
		this.id = (WirkstoffGehaltId) id;
	}

	@Column(name = "GEHALT_REIN", precision = 22, scale = 0)
	public BigDecimal getGehaltRein() {
		return this.gehaltRein;
	}

	public void setGehaltRein(BigDecimal gehaltRein) {
		this.gehaltRein = gehaltRein;
	}

	@Column(name = "GEHALT_REIN_GRUNDSTRUKTUR", precision = 22, scale = 0)
	public BigDecimal getGehaltReinGrundstruktur() {
		return this.gehaltReinGrundstruktur;
	}

	public void setGehaltReinGrundstruktur(BigDecimal gehaltReinGrundstruktur) {
		this.gehaltReinGrundstruktur = gehaltReinGrundstruktur;
	}

	@Column(name = "GEHALT_EINHEIT", length = 20)
	public String getGehaltEinheit() {
		return this.gehaltEinheit;
	}

	public void setGehaltEinheit(String gehaltEinheit) {
		this.gehaltEinheit = gehaltEinheit;
	}

	@Column(name = "GEHALT_BIO", precision = 126, scale = 0)
	public Double getGehaltBio() {
		return this.gehaltBio;
	}

	public void setGehaltBio(Double gehaltBio) {
		this.gehaltBio = gehaltBio;
	}

	@Column(name = "GEHALT_BIO_EINHEIT", length = 20)
	public String getGehaltBioEinheit() {
		return this.gehaltBioEinheit;
	}

	public void setGehaltBioEinheit(String gehaltBioEinheit) {
		this.gehaltBioEinheit = gehaltBioEinheit;
	}

}