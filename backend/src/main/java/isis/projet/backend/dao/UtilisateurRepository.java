package isis.projet.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import isis.projet.backend.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}