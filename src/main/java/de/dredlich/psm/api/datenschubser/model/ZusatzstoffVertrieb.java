package de.dredlich.psm.api.datenschubser.model;

import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import de.dredlich.psm.api.datenschubser.model.pk.ZusatzstoffVertriebId;
import jakarta.persistence.*;

/**
 * ZusatzstoffVertrieb generated by hbm2java
 */
@Entity
@Table(name = "ZUSATZSTOFF_VERTRIEB")
public class ZusatzstoffVertrieb implements java.io.Serializable, ISetItemPK {

	private ZusatzstoffVertriebId id;

	private String vertriebsfirma;

	public ZusatzstoffVertrieb() {
	}

	public ZusatzstoffVertrieb(ZusatzstoffVertriebId id, String vertriebsfirma) {
		this.id = id;
		this.vertriebsfirma = vertriebsfirma;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "kennr", column = @Column(name = "KENNR", nullable = false, length = 9)),
			@AttributeOverride(name = "vertriebsfirmaNr", column = @Column(name = "VERTRIEBSFIRMA_NR", nullable = false, precision = 22, scale = 0)) })
	public ZusatzstoffVertriebId getId() {
		return this.id;
	}

	public void setId(ZusatzstoffVertriebId id) {
		this.id = id;
	}

	@Override
	public void setID(ICompPK id) {
		this.id = (ZusatzstoffVertriebId) id;
	}

	@Column(name = "VERTRIEBSFIRMA", length = 20)
	public String getVertriebsfirma() {
		return this.vertriebsfirma;
	}

	public void setVertriebsfirma(String vertriebsfirma) {
		this.vertriebsfirma = vertriebsfirma;
	}


}