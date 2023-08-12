package de.dredlich.psm.api.datenschubser.model.awg;

import de.dredlich.psm.api.datenschubser.converter.BooleanToStringConverter;
import de.dredlich.psm.api.datenschubser.model.pk.AwgSchadorgId;
import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * AwgSchadorg generated by hbm2java
 */
@Entity
@Table(name = "AWG_SCHADORG")
public class AwgSchadorg implements java.io.Serializable, ISetItemPK {

	private AwgSchadorgId id;
	private Boolean ausgenommen;
	private BigDecimal sortierNr;

	public AwgSchadorg() {
	}

	public AwgSchadorg(AwgSchadorgId id,
					   Boolean ausgenommen,
					   BigDecimal sortierNr) {
		this.id = id;
		this.ausgenommen = ausgenommen;
		this.sortierNr = sortierNr;
	}

	@EmbeddedId

	@AttributeOverrides({
		@AttributeOverride(name = "awgId", column = @Column(name = "AWG_ID", nullable = false, length = 16)),
		@AttributeOverride(name = "schadorg", column = @Column(name = "SCHADORG", nullable = false, length = 20))
	})
	public AwgSchadorgId getId() {
		return this.id;
	}

	public void setId(AwgSchadorgId id) {
		this.id = id;
	}

	@Override
	public void setID(ICompPK id) {
		this.id = (AwgSchadorgId) id;
	}

	@Convert(converter = BooleanToStringConverter.class)
	@Column(name = "AUSGENOMMEN", length = 1)
	public Boolean getAusgenommen() {
		return this.ausgenommen;
	}

	@Convert(converter = BooleanToStringConverter.class)
	public void setAusgenommen(Boolean ausgenommen) {
		this.ausgenommen = ausgenommen;
	}

	@Column(name = "SORTIER_NR", precision = 22)
	public BigDecimal getSortierNr() {
		return this.sortierNr;
	}
	public void setSortierNr(BigDecimal sortierNr) {
		this.sortierNr = sortierNr;
	}

}
