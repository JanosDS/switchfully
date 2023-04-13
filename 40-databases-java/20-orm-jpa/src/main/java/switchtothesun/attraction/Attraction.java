package switchtothesun.attraction;

import jakarta.persistence.*;
import switchtothesun.country.Country;

@Entity
@Table(name = "attraction", schema = "switchtothesun")
public class Attraction {

	@Column(name = "name", length = 255, nullable = false, unique = true)
	private String name;

	@Column(name = "type")
	private String type;
	@ManyToOne
	@JoinColumn(name = "FK_COUNTRY_ID")
	private Country country;
	@Id
	private int id;

	public Attraction(String name, Country country, String type) {
		this.name = name;
		this.country = country;
		this.type = type;
	}

	public Attraction() {

	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return name + " - " + country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
