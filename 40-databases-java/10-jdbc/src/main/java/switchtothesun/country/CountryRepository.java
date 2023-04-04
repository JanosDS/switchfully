package switchtothesun.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepository {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public CountryRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Country> getAllCountries() {
		return jdbcTemplate.query("SELECT * FROM country",
				(row, rowNum) -> new Country(
						row.getInt("id"),
						row.getString("name"),
						row.getInt("fk_continent_id")
				));
	}

	public void addCountry(Country country) {
		try {
			jdbcTemplate.update("INSERT INTO country (id, name, fk_continent_id) VALUES (?, ?, ?)",
					country.getId(),
					country.getName(),
					country.getFk_continent_id()
			);
		} catch (DuplicateKeyException exception) {
			System.err.println(exception.getMessage());
		}
	}

	public void deleteCountry(String name) {
		try {
			jdbcTemplate.update("DELETE FROM country WHERE name = ?",
					name
			);
		} catch (DuplicateKeyException exception) {
			System.err.println(exception.getMessage());
		}
	}
}
