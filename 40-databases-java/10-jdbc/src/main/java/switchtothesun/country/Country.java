package switchtothesun.country;

public class Country {

	private int id;
	private String name;
	private int fk_continent_id;

	public Country(int id, String name, int fk_continent_id) {
		this.id = id;
		this.name = name;
		this.fk_continent_id = fk_continent_id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFk_continent_id() {
		return fk_continent_id;
	}
}
