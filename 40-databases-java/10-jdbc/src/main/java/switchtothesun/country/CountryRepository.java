package switchtothesun.country;

import org.springframework.beans.factory.annotation.Autowired;
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

}
