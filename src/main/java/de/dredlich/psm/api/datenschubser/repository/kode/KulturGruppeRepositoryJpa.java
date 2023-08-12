package de.dredlich.psm.api.datenschubser.repository.kode;

import de.dredlich.psm.api.datenschubser.model.KulturGruppe;
import de.dredlich.psm.api.datenschubser.model.pk.KulturGruppeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KulturGruppeRepositoryJpa extends JpaRepository<KulturGruppe, KulturGruppeId> {
}
