package de.dredlich.psm.api.datenschubser.repository.parallelimport;

import de.dredlich.psm.api.datenschubser.model.ParallelimportAbgelaufen;
import de.dredlich.psm.api.datenschubser.model.pk.ParallelimportAbgelaufenId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParallelimportAbgelaufenRepositoryJpa extends JpaRepository<ParallelimportAbgelaufen, ParallelimportAbgelaufenId> {
}
