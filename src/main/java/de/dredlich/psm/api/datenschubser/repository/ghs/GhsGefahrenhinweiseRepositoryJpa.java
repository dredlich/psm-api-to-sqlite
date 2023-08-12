package de.dredlich.psm.api.datenschubser.repository.ghs;

import de.dredlich.psm.api.datenschubser.model.ghs.GhsGefahrenhinweise;
import de.dredlich.psm.api.datenschubser.model.pk.GhsGefahrenhinweiseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GhsGefahrenhinweiseRepositoryJpa extends JpaRepository<GhsGefahrenhinweise, GhsGefahrenhinweiseId> {
}
