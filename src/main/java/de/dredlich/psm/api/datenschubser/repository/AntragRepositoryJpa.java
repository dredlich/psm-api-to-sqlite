package de.dredlich.psm.api.datenschubser.repository;

import de.dredlich.psm.api.datenschubser.model.Antrag;
import de.dredlich.psm.api.datenschubser.model.pk.AntragId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntragRepositoryJpa extends JpaRepository<Antrag, AntragId> {}
