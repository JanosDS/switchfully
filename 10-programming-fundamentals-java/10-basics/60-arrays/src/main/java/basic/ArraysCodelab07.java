package basic;

public class ArraysCodelab07 {


    /**
     * Change the following code so that it uses an array instead of a list of variables.
     * Can you see that after the change this code has become more flexible?
     */
    public static void main(String[] args) {
        double[] numbers = {34, 12, 24, 89, 10, 96, 74, 67, 46, 53};


        System.out.println("The average is: " + calculateSumOrAverage(numbers));
    }

    private static double calculateSumOrAverage(double number1, double number2, double number3, double number4, double number5, double number6, double number7, double number8, double number9, double number10) {
        double sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        return sum / 10;
    }
    private static double calculateSumOrAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
}
