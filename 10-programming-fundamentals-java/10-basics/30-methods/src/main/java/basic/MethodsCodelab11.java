package basic;

public class MethodsCodelab11 {

    public static void main(String[] args) {

        // Sometimes duplication is a bit more hidden.
        // Can you remove the duplication from this code?
        // The formula for converting °F into °C is "(x - 32) * 5/9"

//        System.out.println("It's 14.0°F outside which is -10.0°C");
//        System.out.println("It's 32.0°F outside which is 0.0°C");
//        System.out.println("It's 50.0°F outside which is 10.0°C");
//        System.out.println("It's 68.0°F outside which is 20.0°C");
//        System.out.println("It's 86.0°F outside which is 30.0°C");
        printFarToC(14);
        printFarToC(32);
        printFarToC(50);
        printFarToC(68);
        printFarToC(86);
    }

    public static double farToC(double far){
        return (far - 32)*5/9;
    }
    public static void printFarToC(double far){
        System.out.println("It's " + far + "°F outside which is " + farToC(far) + "°C");
    }

}
