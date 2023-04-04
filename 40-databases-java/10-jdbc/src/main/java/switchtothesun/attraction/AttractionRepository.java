package switchtothesun.attraction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import switchtothesun.country.CountryRepository;

import java.util.List;

@Repository
public class AttractionRepository {

	private final JdbcTemplate jdbcTemplate;

	private final CountryRepository countryRepository;

	public AttractionRepository(JdbcTemplate jdbcTemplate, CountryRepository countryRepository) {
		this.jdbcTemplate = jdbcTemplate;
		this.countryRepository = countryRepository;
	}

	public List<Attraction> getAllAttractions() {
		return jdbcTemplate.query("SELECT * FROM attraction",
				(row, rowNum) -> new Attraction(
						row.getString("name"),
						countryRepository.findCountryById(row.getInt("fk_country_id"))
				));
	}

	public List<Attraction> findAttractionsForType(String type) {
		return jdbcTemplate.query("SELECT * FROM attraction WHERE type = ?",
				(row, rowNum) -> new Attraction(
						row.getString("name"),
						countryRepository.findCountryById(row.getInt("fk_country_id"))
				),
				type
		);
	}


	public List<Attraction> findAttractionsForCountry(String country) {

		int countryId = countryRepository.findCountryByName(country).getId();

		return jdbcTemplate.query("SELECT * FROM attraction WHERE type = ?",
				(row, rowNum) -> new Attraction(
						row.getString("name"),
						countryRepository.findCountryById(row.getInt("fk_country_id"))
				),
				countryId);
	}
}
