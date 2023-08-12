package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.MittelGefahrenSymbol;
import de.dredlich.psm.api.datenschubser.model.pk.MittelGefahrenSymbolId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelGefahrenSymbolRepositoryJpa extends JpaRepository<MittelGefahrenSymbol, MittelGefahrenSymbolId> {
}
