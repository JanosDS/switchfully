package advanced;

public class DecisionMakingCodelab02 {

    public static void main(String[] args) {
        printOutSport("Hockey");
        System.out.println("*******************");
        printOutSport("Football");
        System.out.println("*******************");
        printOutSport("Tennis");
        System.out.println("*******************");
    }

    /**
     * Convert and split this one switch statement into multiple switch expressions. Put the new switch expressions in separate methods.
     * Run the tests often to see that you haven't broken anything
     * Is the code more readably after the conversion?
     * What do you think?
     * What are the advantages/disadvantages?
     */
    public static void printOutSport(String sport) {
        System.out.println("You have selected " + sport);
        System.out.println("Description: " + description(sport));
        System.out.println("Popularity: " + popularity(sport));
        System.out.println("This sport is " + (hasBall(sport) ? "" : "not ") + "played with a ball");
        System.out.println("This sport is " + (isTeamSport(sport) ? "" : "not ") + "a team sport");
    }

    private static int popularity(String sport) {
        return switch (sport) {
            case "Football" -> 1;
            case "Hockey" -> 2;
            case "Rugby" -> 3;
            case "Archery" -> 4;
            case "Tennis" -> 2;
            case "Handball" -> 4;
            default -> 3;
        };
    }
    private static String description(String sport) {
        return switch (sport) {
            case "Football" -> "You kick a ball away and then run after it.";
            case "Hockey" -> "You kick a ball away with a stick and then run after it.";
            case "Rugby" -> "You run away with a ball and other people try to stop you by ramming you.";
            case "Archery" -> "You try to hit a target with an arrow shot from a bow.";
            case "Tennis" -> "You hit a ball with a racket over a net, in the hope that the guy on the other side of the net can't do the same.";
            case "Handball" -> "You throw a ball away and then run after it.";
            default -> "Unknown sport";
        };
    }
    private static boolean hasBall(String sport){
        return switch (sport) {
            case "Football", "Hockey", "Rugby", "Tennis", "Handball"-> true;
            case "Archery" -> false;
            default -> false;
        };
    }

    private static boolean isTeamSport(String sport){
        return switch(sport){
            case "Football", "Hockey", "Rugby", "Handball"-> true;
            case "Tennis", "Archery" -> false;
            default -> false;
        };
    }
}
