package de.dredlich.psm.api.datenschubser.repository.ghs;

import de.dredlich.psm.api.datenschubser.model.ghs.GhsSignalwoerter;
import de.dredlich.psm.api.datenschubser.model.pk.GhsSignalwoerterId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GhsSignalwoerterRepositoryJpa extends JpaRepository<GhsSignalwoerter, GhsSignalwoerterId> { }
