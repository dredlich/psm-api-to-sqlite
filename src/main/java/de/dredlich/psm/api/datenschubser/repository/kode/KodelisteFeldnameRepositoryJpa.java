package de.dredlich.psm.api.datenschubser.repository.kode;

import de.dredlich.psm.api.datenschubser.model.KodelisteFeldname;
import de.dredlich.psm.api.datenschubser.model.pk.KodelisteFeldnameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KodelisteFeldnameRepositoryJpa extends JpaRepository<KodelisteFeldname, KodelisteFeldnameId> {
}
