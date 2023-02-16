package isis.projet.backend.service;
import isis.projet.backend.dao.UtilisateurRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurDao;

    public UtilisateurService(UtilisateurRepository utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    @Transactional
    public long combienDePays() {
        return utilisateurDao.count();
    }
}
