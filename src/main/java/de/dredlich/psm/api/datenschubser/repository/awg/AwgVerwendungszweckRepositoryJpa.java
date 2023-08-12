package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgVerwendungszweck;
import de.dredlich.psm.api.datenschubser.model.pk.AwgVerwendungszweckId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwgVerwendungszweckRepositoryJpa extends JpaRepository<AwgVerwendungszweck, AwgVerwendungszweckId> {
}
