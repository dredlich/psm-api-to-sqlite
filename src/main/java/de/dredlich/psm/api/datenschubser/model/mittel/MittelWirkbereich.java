package de.dredlich.psm.api.datenschubser.model.mittel;

import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import de.dredlich.psm.api.datenschubser.model.pk.MittelWirkbereichId;
import jakarta.persistence.*;

/**
 * MittelWirkbereich generated by hbm2java
 */
@Entity
@Table(name = "MITTEL_WIRKBEREICH")
public class MittelWirkbereich implements java.io.Serializable, ISetItemPK {

	private MittelWirkbereichId id;

	public MittelWirkbereich() {
	}

	public MittelWirkbereich(MittelWirkbereichId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "kennr", column = @Column(name = "KENNR", nullable = false, length = 9)),
			@AttributeOverride(name = "wirkungsbereich", column = @Column(name = "WIRKUNGSBEREICH", nullable = false, length = 20)) })
	public MittelWirkbereichId getId() {
		return this.id;
	}
	public void setId(MittelWirkbereichId id) {
		this.id = id;
	}

	@Override
	public void setID(ICompPK id) {
		this.id = (MittelWirkbereichId) id;
	}

}
