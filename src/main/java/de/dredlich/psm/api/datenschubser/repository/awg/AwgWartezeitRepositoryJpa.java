package de.dredlich.psm.api.datenschubser.repository.awg;

import de.dredlich.psm.api.datenschubser.model.awg.AwgWartezeit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AwgWartezeitRepositoryJpa extends JpaRepository<AwgWartezeit, BigDecimal> {
}
