package solution.switchtothesun.attraction;

import jakarta.persistence.*;
import solution.switchtothesun.attraction.attraction_overview.AttractionOverview;
import solution.switchtothesun.country.Country;
import solution.switchtothesun.tourist.Tourist;

import java.util.List;

@Entity
@Table(name = "ATTRACTION")
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attraction_seq")
    @SequenceGenerator(name = "attraction_seq", sequenceName = "attraction_seq", allocationSize = 1)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private AttractionType type;

    @ManyToOne
    @JoinColumn(name = "FK_COUNTRY_ID")
    private Country country;

    @OneToOne
    @JoinColumn(name = "FK_ATTRACTION_OVERVIEW")
    private AttractionOverview attractionOverview;

    @ManyToMany
    @JoinTable(name = "TOURIST_ATTRACTION",
            joinColumns = @JoinColumn(name = "ATTRACTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "TOURIST_ID"))
    private List<Tourist> touristList;

    public Attraction() {

    }

    public Attraction(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Long getId() {
        return id;
    }

    public AttractionType getType() {
        return type;
    }

    public AttractionOverview getAttractionOverview() {
        return attractionOverview;
    }

    public List<Tourist> getTouristList() {
        return touristList;
    }

    @Override
    public String toString() {
        return name + " - " + country;
    }
}
