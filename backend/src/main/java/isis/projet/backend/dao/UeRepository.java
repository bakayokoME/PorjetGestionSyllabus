package isis.projet.backend.dao;

import isis.projet.backend.entity.Ue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UeRepository extends JpaRepository<Ue, Integer> {
}