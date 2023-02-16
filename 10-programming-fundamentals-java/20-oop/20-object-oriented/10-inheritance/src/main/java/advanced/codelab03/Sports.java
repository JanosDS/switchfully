package advanced.codelab03;

import advanced.codelab03.sports.*;

public class Sports {

    public static void main(String[] args) {
        printOutSport("Hockey");
        System.out.println("*******************");
        printOutSport("Football");
        System.out.println("*******************");
        printOutSport("Tennis");
        System.out.println("*******************");
    }

    /**
     * Remember this exercise from decision-making?
     * Instead of splitting this up into smaller switch case rewrite the following code using inheritance.
     * Put every sport specific information in their appropriate subclass
     * Hint: You'll need one switch case that will convert the parameter sport into a subclass.
     */
    public static void printOutSport(String sport) {
        Sport chosenSport = new Sport();
        switch (sport) {
            case "Football":
                System.out.println("You have selected Football");
                chosenSport = new Football();
                break;
            case "Hockey":
                System.out.println("You have selected Hockey");
                chosenSport = new Hockey();
                break;
            case "Rugby":
                System.out.println("You have selected Rugby");
                chosenSport = new Rugby();
                break;
            case "Archery":
                System.out.println("You have selected Archery");
                chosenSport = new Archery();
                break;
            case "Tennis":
                System.out.println("You have selected Tennis");
                chosenSport = new Tennis();
                break;
            case "Handball":
                System.out.println("You have selected Handball");
                chosenSport = new Handball();
                break;
            default:
                System.out.println("You have selected " + sport);
                chosenSport = new Sport(3, "Unknown sport", false, true);
        }
        System.out.println(chosenSport.toString());
    }
}
