package basic;

import java.time.Year;

public class MethodsCodelab12 {

    public static void main(String[] args) {

        // ------------
        // This code could use some more methods
        // Use the principles of SRP and Duplication to find a good set of methods
        // Hint: Try to describe in your own words what this code does
        // - this code is used to ... (the final result of the code). Use this wording to find good method names.
        // - look for and remove duplication

        String name1 = "Jef";
        int birthYear1 = 1988;
        printPersGeg(name1, calcAge(birthYear1));

        String name2 = "Sofie";
        int birthYear2 = 2005;
        printPersGeg(name2, calcAge(birthYear2));

    }

    public static void printPersGeg(String name, int age){
        System.out.println("***********************");
        System.out.println("Hi my name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("Which means I am");
        if(isAdult(age)){
            System.out.println("an adult");
        } else {
            System.out.println("not an adult");
        }
    }

    public static boolean isAdult(int age){
        if(age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int calcAge(int birthyear){
        return Year.now().getValue() - birthyear;
    }
}
