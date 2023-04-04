package solution.switchtothesun.continent;

import jakarta.persistence.*;
import solution.switchtothesun.country.Country;

import java.util.List;

@Entity
@Table(name = "CONTINENT")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "continent_seq")
    @SequenceGenerator(name = "continent_seq", sequenceName = "continent_seq", allocationSize = 1)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "FK_CONTINENT_ID")
    private List<Country> countryList;

    public Continent() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
