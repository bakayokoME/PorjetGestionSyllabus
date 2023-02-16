package isis.projet.backend.dao;

import isis.projet.backend.entity.Annee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnneeRepository extends JpaRepository<Annee, Integer> {
}