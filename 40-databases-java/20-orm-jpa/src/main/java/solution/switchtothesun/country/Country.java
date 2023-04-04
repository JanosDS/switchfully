package solution.switchtothesun.country;

import jakarta.persistence.*;
import solution.switchtothesun.country.geographical_information.GeographicalInformation;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_seq")
    @SequenceGenerator(name = "country_seq", sequenceName = "country_seq", allocationSize = 1)
    private Long id;

    private String name;

    @Embedded
    private GeographicalInformation geographicalInformation;

    public Country() {

    }

    public Country(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GeographicalInformation getGeographicalInformation() {
        return geographicalInformation;
    }

    @Override
    public String toString() {
        return name;
    }
}
