package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.MittelAbpackung;
import de.dredlich.psm.api.datenschubser.model.pk.MittelAbpackungId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelAbpackungRepositoryJpa extends JpaRepository<MittelAbpackung, MittelAbpackungId> {
}
