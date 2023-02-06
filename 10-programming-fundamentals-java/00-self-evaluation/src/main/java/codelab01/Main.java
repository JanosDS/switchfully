package codelab01;


/**
 * Read the README.md for the assignment
 */
public class Main {
    // Create your methods here
    public static void print_helloworld(){
        System.out.println("Hello, World!");
    }

    public static void printAny(String string){
        System.out.println(string);
    }

    public static void printNumber(int number){
        System.out.println("I am an int: " + number);
    }
    public static void printNumber(double number){
        System.out.println("I am a double: " +  number);
    }
    public static void main(String[] args) {
        print_helloworld();
    }
}
