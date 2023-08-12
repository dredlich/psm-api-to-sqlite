package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgBem;
import de.dredlich.psm.api.datenschubser.model.pk.AwgBemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwgBemRepositoryJpa extends JpaRepository<AwgBem, AwgBemId> {}
