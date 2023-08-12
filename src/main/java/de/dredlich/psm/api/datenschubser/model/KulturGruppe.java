package de.dredlich.psm.api.datenschubser.model;

import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import de.dredlich.psm.api.datenschubser.model.pk.KulturGruppeId;
import jakarta.persistence.*;

/**
 * KulturGruppe generated by hbm2java
 */
@Entity
@Table(name = "KULTUR_GRUPPE")
public class KulturGruppe implements java.io.Serializable, ISetItemPK {

	private KulturGruppeId id;

	public KulturGruppe() {
	}

	public KulturGruppe(KulturGruppeId id) {
		this.id = id;
	}


	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "kulturGruppe", column = @Column(name = "KULTUR_GRUPPE", nullable = false, length = 20)),
			@AttributeOverride(name = "kultur", column = @Column(name = "KULTUR", nullable = false, length = 20)) })
	public KulturGruppeId getId() {
		return this.id;
	}

	public void setId(KulturGruppeId id) {
		this.id = id;
	}
	@Override
	public void setID(ICompPK id) {
		this.id = (KulturGruppeId) id;
	}

}
