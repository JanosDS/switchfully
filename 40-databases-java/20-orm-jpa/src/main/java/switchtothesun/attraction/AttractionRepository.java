package switchtothesun.attraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttractionRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Attraction> getAllAttractions() {
		return entityManager.createQuery("SELECT a FROM Attraction a", Attraction.class)
				.getResultList();
	}

	public List<Attraction> findAttractionsOfType(String type) {
		return entityManager.createQuery("select a from Attraction a where a.type = :type", Attraction.class)
				.setParameter("type", type)
				.getResultList();
	}

	public List<Attraction> findAttractionsInCountry(String country) {
		return entityManager.createQuery("select a from Attraction a where a.country.name = :country", Attraction.class)
				.setParameter("country", country)
				.getResultList();
	}

}
