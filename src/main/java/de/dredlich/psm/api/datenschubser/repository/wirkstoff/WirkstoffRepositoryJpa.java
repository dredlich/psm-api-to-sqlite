package de.dredlich.psm.api.datenschubser.repository.wirkstoff;

import de.dredlich.psm.api.datenschubser.model.Wirkstoff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WirkstoffRepositoryJpa extends JpaRepository<Wirkstoff, String> {
}
