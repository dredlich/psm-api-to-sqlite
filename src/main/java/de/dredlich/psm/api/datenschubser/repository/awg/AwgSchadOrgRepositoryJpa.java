package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgSchadorg;
import de.dredlich.psm.api.datenschubser.model.pk.AwgSchadorgId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgSchadOrgRepositoryJpa extends JpaRepository<AwgSchadorg, AwgSchadorgId> {
}
