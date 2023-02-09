package basic;

import java.util.Scanner;

public class DecisionMakingCodelab06 {

    /**
     * Make a program that will ask the user: "Which kind of greeting do you want (hello/goodbye)?: "
     * Depending on the answer you print out a different message:
     * - in case of 'hello': "We welcome you to our awesome application!"
     * - in case of 'goodbye': "Goodbye, hope to see you again."
     *
     * You can make your life easier by just copying the code from the previous exercise and use that as a starting point.
     * Finished? Try it out!
     *
     * Before we continue, did you think of the edge cases?
     * Try to think of all the different ways a user can break your small application.
     * Which ones can you prevent?
     * Adapt your solution with guard clauses so that even if the user writes something unexpected, your program still behaves in a logical way.
     */
    public static void main(String[] args) {
        String input = new String();
        do{
            input = askInput();
        }while(!validateInput(input));
        reply(input);
    }

    public static String askInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which kind of greeting do you want (hello/goodbye)?");
        return scanner.nextLine();
    }

    public static boolean validateInput(String input){
        if(input.equals("hello") || input.equals("goodbye") ){
            return true;
        }
        return  false;
    }

    public static void reply(String input){
        if(input.equals("hello") ){
            System.out.println("We welcome you to our awesome application!");
        }
        if(input.equals("goodbye") ){
            System.out.println("Goodbye, hope to see you again.");
        }
    }
}
