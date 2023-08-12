package de.dredlich.psm.api.datenschubser.repository.auflage;

import de.dredlich.psm.api.datenschubser.model.Auflagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuflagenRepositoryJpa extends JpaRepository<Auflagen, Long> {}
