package switchtothesun.country;

import jakarta.persistence.*;

@Entity
@Table(name = "country", schema = "switchtothesun")
public class Country {


	@Id
	@SequenceGenerator(name = "id", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
	private int id;
	private String name;

	public Country(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Country() {

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return name;
	}
}
