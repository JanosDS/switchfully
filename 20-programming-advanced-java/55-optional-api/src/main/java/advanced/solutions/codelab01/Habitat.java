package advanced.solutions.codelab01;

/**
 * You don't need to make any changes to this class
 */
public enum Habitat {
    HOUSE(21),
    FOREST(14),
    SEA(20),
    DESERT(null);

    private final Integer averageTemperature;

    Habitat(Integer averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public Integer getAverageTemperature() {
        return averageTemperature;
    }
}
