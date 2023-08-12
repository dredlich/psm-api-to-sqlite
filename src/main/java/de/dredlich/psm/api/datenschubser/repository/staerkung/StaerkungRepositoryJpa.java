package de.dredlich.psm.api.datenschubser.repository.staerkung;

import de.dredlich.psm.api.datenschubser.model.Staerkung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaerkungRepositoryJpa extends JpaRepository<Staerkung, String> {
}
