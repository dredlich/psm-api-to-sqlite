package de.dredlich.psm.api.datenschubser.repository.auflage;

import de.dredlich.psm.api.datenschubser.model.AuflageRedu;
import de.dredlich.psm.api.datenschubser.model.pk.AuflageReduId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuflageReduRepositoryJpa extends JpaRepository<AuflageRedu, AuflageReduId> {}
