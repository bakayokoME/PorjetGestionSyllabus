package isis.projet.backend.service;
import isis.projet.backend.dao.MatiereRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class MatiereService {
    private final MatiereRepository matiereDao;

    public MatiereService(MatiereRepository matiereDao) {
        this.matiereDao = matiereDao;
    }

    @Transactional
    public long combienDeMatiere() {
        return matiereDao.count();
    }
}
