package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgZulassung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgZulassungRepositoryJpa extends JpaRepository<AwgZulassung, String> {
}
