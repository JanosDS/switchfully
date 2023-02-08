package advanced;

//Peer review exercise. Discuss the flow of this program with a peer afterwards
public class ExpressionsCodelab03 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 3");
        System.out.println("--------------");

        // ----------------
        // An extra bit of information
        // ++ or -- are evaluated after () but before *, / and %
        // Knowing this: what is the result of the following expression?
        // Try to calculate it first manually
        // What are the values of first and second after execution?

        int first = 1;
        int second = 3;

        int result = second-- + 3 + 2 * 4 / ++first - (2 + --second) % 2 + ++first + second;
        // 3 + 3 + 2 * 4 / 2 - (2 + 1) % 2 + 3 + 1
        // 3 + 3 + 8/2 - 3%2 + 3 + 1
        // 6 + 4 - 1 + 3 +1
        // 13
        // first = 3
        // second = 1
        System.out.println(result);
        System.out.println(second);
        System.out.println(first);
    }
}
