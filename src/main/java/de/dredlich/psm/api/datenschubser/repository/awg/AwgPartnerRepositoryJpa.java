package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgPartner;
import de.dredlich.psm.api.datenschubser.model.pk.AwgPartnerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgPartnerRepositoryJpa extends JpaRepository<AwgPartner, AwgPartnerId> {
}
