package solution.switchtothesun.attraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class AttractionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Attraction> getAllAttractions() {
        return entityManager.createQuery("select a from Attraction a", Attraction.class).getResultList();
    }

    public List<Attraction> findAttractionsOfType(AttractionType type) {
        return entityManager.createQuery("select a from Attraction a where a.type = :type", Attraction.class)
                .setParameter("type", type)
                .getResultList();
    }

    public List<Attraction> findAttractionsInCountry(String country) {
        return entityManager.createQuery("select a from Attraction a where a.country.name = :country", Attraction.class)
                .setParameter("country", country)
                .getResultList();
    }

    public Attraction findAttractionByName(String attractionName) {
        return entityManager.createQuery("select a from Attraction a where a.name = :name", Attraction.class)
                .setParameter("name", attractionName)
                .getSingleResult();
    }

    public List<Attraction> getAttractionsByTourist(String tourist) {
        return entityManager.createQuery("select a from Attraction a where (select t from Tourist t where t.name = :tourist) member of a.touristList", Attraction.class)
                .setParameter("tourist", tourist)
                .getResultList();
    }
}
