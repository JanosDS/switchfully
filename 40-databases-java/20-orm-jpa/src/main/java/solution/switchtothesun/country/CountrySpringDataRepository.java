package solution.switchtothesun.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountrySpringDataRepository extends JpaRepository<Country, Long> {

}
