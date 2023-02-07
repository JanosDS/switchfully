package codelab04;

/**
 * Read the README.md for the assignment
 */
public class Main {

    public static String month(int i) {
        String months[] = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[i-1];
    }

    public static double calculatePrice(int amountOfElements) {
        double totalprice = 0;
        for(int i = 0; i < amountOfElements; i++){
            if(i < 10){
                totalprice += 5;
            }
            else if (10 <= i && i < 15){
                totalprice += 4;
            }
            else if (15 <= i){
                totalprice += 3;
            }
        }
        return totalprice;
    }

    public static String returnText(int i) {
        switch (i) {
            case 1:
                return "It's something";
            case 2:
                return "That's more like it";
            case 3:
                return "Way to go";
            default:
                return "That's a fail whale";
        }
    }
}
