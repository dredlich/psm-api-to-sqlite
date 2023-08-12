package de.dredlich.psm.api.datenschubser.repository.kode;

import de.dredlich.psm.api.datenschubser.model.SchadorgGruppe;
import de.dredlich.psm.api.datenschubser.model.pk.SchadorgGruppeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchadOrgGruppeRepositoryJpa extends JpaRepository<SchadorgGruppe, SchadorgGruppeId> {
}
