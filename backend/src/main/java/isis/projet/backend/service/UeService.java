package isis.projet.backend.service;
import isis.projet.backend.dao.UeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UeService {
    private final UeRepository ueDao;

    public UeService(UeRepository ueDao) {
        this.ueDao = ueDao;
    }

    @Transactional
    public long combienDue() {
        return ueDao.count();
    }
}
