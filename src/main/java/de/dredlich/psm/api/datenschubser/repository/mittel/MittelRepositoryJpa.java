package de.dredlich.psm.api.datenschubser.repository.mittel;

import de.dredlich.psm.api.datenschubser.model.mittel.Mittel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MittelRepositoryJpa extends JpaRepository<Mittel, String> { }
