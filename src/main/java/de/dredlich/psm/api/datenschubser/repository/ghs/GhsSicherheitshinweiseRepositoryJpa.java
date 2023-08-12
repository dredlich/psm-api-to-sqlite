package de.dredlich.psm.api.datenschubser.repository.ghs;

import de.dredlich.psm.api.datenschubser.model.ghs.GhsSicherheitshinweise;
import de.dredlich.psm.api.datenschubser.model.pk.GhsSicherheitshinweiseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GhsSicherheitshinweiseRepositoryJpa extends JpaRepository<GhsSicherheitshinweise, GhsSicherheitshinweiseId> {
}
