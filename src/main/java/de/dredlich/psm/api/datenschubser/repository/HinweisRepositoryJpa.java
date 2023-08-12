package de.dredlich.psm.api.datenschubser.repository;

import de.dredlich.psm.api.datenschubser.model.Hinweis;
import de.dredlich.psm.api.datenschubser.model.pk.HinweisId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinweisRepositoryJpa extends JpaRepository<Hinweis, HinweisId> {
}
