package de.dredlich.psm.api.datenschubser.repository.zusatzstoff;

import de.dredlich.psm.api.datenschubser.model.Zusatzstoff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZusatzstoffRepositoryJpa extends JpaRepository<Zusatzstoff, String> {
}
