package de.dredlich.psm.api.datenschubser.repository.kode;

import de.dredlich.psm.api.datenschubser.model.Kode;
import de.dredlich.psm.api.datenschubser.model.pk.KodeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KodeRepositoryJpa extends JpaRepository<Kode, KodeId> {
}
