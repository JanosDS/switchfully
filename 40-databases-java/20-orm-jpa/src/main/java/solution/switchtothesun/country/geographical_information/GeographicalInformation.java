package solution.switchtothesun.country.geographical_information;

import jakarta.persistence.Embeddable;

@Embeddable
public class GeographicalInformation {
    private final int population;
    private final double landArea;
    private final double gdp;

    public GeographicalInformation() {
        this(0, 0.0, 0.0);
    }

    public GeographicalInformation(int population, double landArea, double gdp) {
        this.population = population;
        this.landArea = landArea;
        this.gdp = gdp;
    }

    public int getPopulation() {
        return population;
    }

    public double getLandArea() {
        return landArea;
    }

    public double getGdp() {
        return gdp;
    }
}
