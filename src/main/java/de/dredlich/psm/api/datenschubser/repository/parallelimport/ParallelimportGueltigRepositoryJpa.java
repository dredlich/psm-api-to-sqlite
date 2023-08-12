package de.dredlich.psm.api.datenschubser.repository.parallelimport;

import de.dredlich.psm.api.datenschubser.model.ParallelimportGueltig;
import de.dredlich.psm.api.datenschubser.model.pk.ParallelimportGueltigId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParallelimportGueltigRepositoryJpa extends JpaRepository<ParallelimportGueltig, ParallelimportGueltigId> {
}
