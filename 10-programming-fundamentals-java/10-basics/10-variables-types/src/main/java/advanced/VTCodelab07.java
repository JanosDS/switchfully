package advanced;

public class VTCodelab07 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 8");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a short variable, give it value 128
        // Declare a byte variable, initialize it with the short variable, cast it to a byte
        // Print the result using: System.out.println("Printing a byte initialized with a cast short (128): " + <YOUR_BYTE_VARIABLE_NAME>);
        // Does it look as expected? Write a comment on why (not)?
        short x = 128;
        byte y = (byte)x;
        System.out.println("Printing a byte initialized with a cast short (128): " + y);
        //max value of a byte is 127 -> overflows to min value: -128
    }

}
