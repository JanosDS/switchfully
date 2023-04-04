package solution.switchtothesun.continent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ContinentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Continent findContinentByName(String continent) {
        return entityManager.createQuery("select c from Continent c where c.name = :name", Continent.class)
                .setParameter("name", continent)
                .getSingleResult();
    }
}
