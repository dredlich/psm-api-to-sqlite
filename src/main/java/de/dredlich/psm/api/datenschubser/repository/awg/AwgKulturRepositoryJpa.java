package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgKultur;
import de.dredlich.psm.api.datenschubser.model.pk.AwgKulturId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgKulturRepositoryJpa extends JpaRepository<AwgKultur, AwgKulturId> {
}
