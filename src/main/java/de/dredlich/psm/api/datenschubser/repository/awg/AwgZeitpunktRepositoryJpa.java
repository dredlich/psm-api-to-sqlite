package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgZeitpunkt;
import de.dredlich.psm.api.datenschubser.model.pk.AwgZeitpunktId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgZeitpunktRepositoryJpa extends JpaRepository<AwgZeitpunkt, AwgZeitpunktId> {
}
