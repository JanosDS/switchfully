package switchtothesun.country;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {


    @Id
    private int id;
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public Country() {
        
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
