package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.MittelWirkbereich;
import de.dredlich.psm.api.datenschubser.model.pk.MittelWirkbereichId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelWirkbereichRepositoryJpa extends JpaRepository<MittelWirkbereich, MittelWirkbereichId> {
}
