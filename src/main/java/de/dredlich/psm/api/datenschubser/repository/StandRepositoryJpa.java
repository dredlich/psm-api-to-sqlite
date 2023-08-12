package de.dredlich.psm.api.datenschubser.repository;

import de.dredlich.psm.api.datenschubser.model.Stand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface StandRepositoryJpa extends JpaRepository<Stand, Date> {
}
