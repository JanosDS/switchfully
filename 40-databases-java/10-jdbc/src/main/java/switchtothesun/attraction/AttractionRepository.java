package switchtothesun.attraction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttractionRepository {

	private final JdbcTemplate jdbcTemplate;

	public AttractionRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Attraction> getAllAttractions() {
		return jdbcTemplate.query("SELECT * FROM attraction",
				(row, rowNum) -> new Attraction(
						row.getString("name")
				));
	}
}
