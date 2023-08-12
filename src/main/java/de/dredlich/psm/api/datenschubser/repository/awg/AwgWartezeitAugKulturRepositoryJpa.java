package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgWartezeitAusgKultur;
import de.dredlich.psm.api.datenschubser.model.pk.AwgWartezeitAusgKulturId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgWartezeitAugKulturRepositoryJpa extends JpaRepository<AwgWartezeitAusgKultur, AwgWartezeitAusgKulturId> {
}
