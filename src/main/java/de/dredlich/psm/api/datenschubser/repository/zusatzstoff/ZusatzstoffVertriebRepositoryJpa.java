package de.dredlich.psm.api.datenschubser.repository.zusatzstoff;

import de.dredlich.psm.api.datenschubser.model.ZusatzstoffVertrieb;
import de.dredlich.psm.api.datenschubser.model.pk.ZusatzstoffVertriebId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZusatzstoffVertriebRepositoryJpa extends JpaRepository<ZusatzstoffVertrieb, ZusatzstoffVertriebId> {
}
