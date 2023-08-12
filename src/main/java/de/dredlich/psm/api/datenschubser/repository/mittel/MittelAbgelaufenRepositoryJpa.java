package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.MittelAbgelaufen;
import de.dredlich.psm.api.datenschubser.model.pk.MittelAbgelaufenId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelAbgelaufenRepositoryJpa extends JpaRepository<MittelAbgelaufen, MittelAbgelaufenId> {
}
