package isis.projet.backend.dao;
import isis.projet.backend.dao.MatiereRepository;
import isis.projet.backend.entity.Matiere;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
}