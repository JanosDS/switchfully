package advanced;

public class LoopsCodelabs09 {

    /**
     * Create a method that will return the n-th fibonacci number.
     * E.g.
     * fibonacci(1) = 1
     * fibonacci(2) = 1
     * fibonacci(3) = 2
     * fibonacci(4) = 3
     * fibonacci(5) = 5
     * fibonacci(6) = 8
     * ...
     * fibonacci(n) = fibonacci(n - 1) + fibonacci (n - 2)
     */
    public static int fibonacci(int number) {
        return (int)Math.round( Math.pow(1+ Math.sqrt(5), number) / (Math.pow(2, number) * Math.sqrt(5)));
    }
}
