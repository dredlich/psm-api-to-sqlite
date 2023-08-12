package de.dredlich.psm.api.datenschubser.repository.kode;

import de.dredlich.psm.api.datenschubser.model.Kodeliste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KodeListeRepositoryJpa extends JpaRepository<Kodeliste, Short> {
}
