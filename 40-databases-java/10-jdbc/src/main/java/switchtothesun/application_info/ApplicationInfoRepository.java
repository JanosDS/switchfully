package switchtothesun.application_info;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationInfoRepository {

    private JdbcTemplate jdbcTemplate;

    public ApplicationInfoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ApplicationInfo getApplicationInfo() {
        return jdbcTemplate.query("select * from APPLICATION_INFO",
                (row, rowNum) -> new ApplicationInfo(
                        row.getInt("id"),
                        row.getString("title"),
                        row.getString("admin_email"),
                        row.getInt("version")
                )).stream().findFirst().orElseThrow(() -> new RuntimeException());
    }
}
