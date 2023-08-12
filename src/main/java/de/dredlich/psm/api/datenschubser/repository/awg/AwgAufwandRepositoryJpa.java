package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgAufwand;
import de.dredlich.psm.api.datenschubser.model.pk.AwgAufwandId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgAufwandRepositoryJpa extends JpaRepository<AwgAufwand, AwgAufwandId> { }
