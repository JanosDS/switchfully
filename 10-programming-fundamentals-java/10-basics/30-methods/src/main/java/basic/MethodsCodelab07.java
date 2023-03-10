package basic;

public class MethodsCodelab07 {

    public static void main(String[] args) {
        // Create a method add, making the addition of its two parameters and returning the result (all type double)
        // Create a method subtract, subtracting the first parameter by the second and returning the result (all type double)
        // Create a method multiply, multiplying it's two parameters and returning the result (all type double)
        // Create a method divide, dividing the first parameter by the second and returning the result (all type double)
        // Transform the following equation using only your newly created methods. Print out the result:
        //  --> ((4.5 + 3.5) / 2.0) + (2.0 * (4.5 - 1.5))
        //  --> e.g.: (1 + 1) should we written as add(1, 1)
        System.out.println(add(divide(add(4.5,3.5), 2.0), multiply(2.0, substract(4.5,1.5))));
    }

    public static double add(double numb1, double numb2){
        return numb1 + numb2;
    }
    public static double substract(double numb1, double numb2){
        return numb1 - numb2;
    }
    public static double multiply(double numb1, double numb2){
        return  numb1 * numb2;
    }
    public static double divide(double numb1, double numb2){
        return numb1 / numb2;
    }

}
