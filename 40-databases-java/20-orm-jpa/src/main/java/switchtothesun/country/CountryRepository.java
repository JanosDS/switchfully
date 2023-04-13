package switchtothesun.country;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Country> getAllCountries() {
		return entityManager.createQuery("select c from Country c", Country.class).getResultList();
	}

	public void addCountry(Country country) {
		entityManager.persist(country);
	}

	public void delete(int id) {
		Country countryToDelete = entityManager.find(Country.class, id);
		entityManager.remove(countryToDelete);
	}
}
