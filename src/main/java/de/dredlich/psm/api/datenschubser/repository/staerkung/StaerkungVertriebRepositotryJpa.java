package de.dredlich.psm.api.datenschubser.repository.staerkung;

import de.dredlich.psm.api.datenschubser.model.StaerkungVertrieb;
import de.dredlich.psm.api.datenschubser.model.pk.StaerkungVertriebId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaerkungVertriebRepositotryJpa extends JpaRepository<StaerkungVertrieb, StaerkungVertriebId> {
}
