package advanced.codelab03.sports;

public class Sport {
    private int popularity;
    private String description;
    private boolean hasBall;
    private boolean teamSport;

    public Sport() {
    }

    public Sport(int popularity, String description, boolean hasBall, boolean teamSport) {
        this.popularity = popularity;
        this.description = description;
        this.hasBall = hasBall;
        this.teamSport = teamSport;
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nPopularity: " + popularity + "\nThis sport is " + (hasBall ? "" : "not ") + "played with a ball" + "\nThis sport is " + (teamSport ? "" : "not ") + "a team sport";
    }
}
