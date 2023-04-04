package solution.switchtothesun.attraction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AttractionSpringDataRepository extends JpaRepository<Attraction, Long> {

    List<Attraction> findAttractionsByType(AttractionType type);

    List<Attraction> findAttractionsByCountryName(String country);

    Optional<Attraction> findAttractionByName(String attractionName);

    @Query("select a from Attraction a where (select t from Tourist t where t.name = :tourist) member of a.touristList")
    List<Attraction> getAttractionsByTouristName(@Param("tourist") String tourist);
}
