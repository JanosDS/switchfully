package basic;

public class VTCodelab17 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 17");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a long variable, give it value 10 000 000 000
        // Declare an int variable, initialize it with the long variable but explicitly cast it to an int
        // How is this different from assignment 6?
        // Print the result using: System.out.println("Printing an int initialized with a cast long: " + <YOUR_INT_VARIABLE_NAME>);
        long x = 10000000000L;
        int y = (int)x;
        System.out.println("Printing an int initialized with a cast long: " + y);
        //A helper function is used to cast the value of the long var to an int var (a part gets lost due to incompatible sizes)
    }

}
