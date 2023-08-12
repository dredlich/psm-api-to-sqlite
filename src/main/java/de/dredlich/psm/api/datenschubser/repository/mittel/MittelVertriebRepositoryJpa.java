package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.MittelVertrieb;
import de.dredlich.psm.api.datenschubser.model.pk.MittelVertriebId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelVertriebRepositoryJpa extends JpaRepository<MittelVertrieb, MittelVertriebId> {
}
