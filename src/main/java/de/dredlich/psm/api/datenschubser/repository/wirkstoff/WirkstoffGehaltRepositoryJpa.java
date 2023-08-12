package de.dredlich.psm.api.datenschubser.repository.wirkstoff;

import de.dredlich.psm.api.datenschubser.model.WirkstoffGehalt;
import de.dredlich.psm.api.datenschubser.model.pk.WirkstoffGehaltId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WirkstoffGehaltRepositoryJpa extends JpaRepository<WirkstoffGehalt, WirkstoffGehaltId> {
}
