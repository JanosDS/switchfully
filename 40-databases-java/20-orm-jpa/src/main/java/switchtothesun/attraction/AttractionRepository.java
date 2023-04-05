package switchtothesun.attraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import switchtothesun.country.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttractionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public AttractionRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Attraction> getAllAttractions() {
		return entityManager.createQuery("SELECT a FROM Attraction a").getResultList();
	}

	public List<Attraction> findAttractionsOfType(String type) {
		return jdbcTemplate.query("select a.name as attraction_name, c.name as country_name from attraction a join COUNTRY c on a.FK_COUNTRY_ID = c.ID where type = ?", toAttractionMapper(), type);
	}

	public List<Attraction> findAttractionsInCountry(String country) {
		return jdbcTemplate.query("select a.name as attraction_name, c.name as country_name from attraction a join country c on a.FK_COUNTRY_ID = c.ID where c.NAME = ?", toAttractionMapper(), country);
	}

	private RowMapper<Attraction> toAttractionMapper() {
		return (row, rowNum) -> new Attraction(row.getString("attraction_name"), new Country(row.getString("country_name")));
	}
}
