package de.dredlich.psm.api.datenschubser.repository;

import de.dredlich.psm.api.datenschubser.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepositoryJpa extends JpaRepository<Adresse, Long> {}
