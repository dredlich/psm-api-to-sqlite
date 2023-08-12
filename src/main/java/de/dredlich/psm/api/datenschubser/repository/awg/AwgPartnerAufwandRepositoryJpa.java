package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgPartnerAufwand;
import de.dredlich.psm.api.datenschubser.model.pk.AwgPartnerAufwandId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwgPartnerAufwandRepositoryJpa extends JpaRepository<AwgPartnerAufwand, AwgPartnerAufwandId> {
}
