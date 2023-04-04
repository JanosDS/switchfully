package solution.switchtothesun.application_info;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationInfoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ApplicationInfo getApplicationInfo() {
        return entityManager.createQuery("select a from ApplicationInfo a", ApplicationInfo.class).getResultList().stream()
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
