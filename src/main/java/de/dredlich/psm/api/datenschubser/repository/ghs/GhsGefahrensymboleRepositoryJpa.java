package de.dredlich.psm.api.datenschubser.repository.ghs;

import de.dredlich.psm.api.datenschubser.model.ghs.GhsGefahrensymbole;
import de.dredlich.psm.api.datenschubser.model.pk.GhsGefahrensymboleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GhsGefahrensymboleRepositoryJpa extends JpaRepository<GhsGefahrensymbole, GhsGefahrensymboleId> {
}
