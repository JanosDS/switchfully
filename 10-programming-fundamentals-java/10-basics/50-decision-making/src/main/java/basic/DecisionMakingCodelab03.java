package basic;

public class DecisionMakingCodelab03 {

    public static void main(String[] args) {
        System.out.println(uniqueSum(3, 3, 5));
    }

    /**
     * Given 3 int values, a b c, return their sum.
     * However, if one of the values is the same as another of the values,
     * it does not count towards the sum.
     *      uniqueSum(1, 2, 3) → 6
     *      uniqueSum(3, 2, 3) → 2
     *      uniqueSum(3, 3, 3) → 0
    */
    public static int uniqueSum(int operand1, int operand2, int operand3) {
        int sum = 0;
        if(operand1 != operand2 && operand1 != operand3){
            sum += operand1;
        }
        if(operand2 != operand1 && operand2 != operand3){
            sum += operand2;
        }
        if(operand3 != operand2 && operand3 != operand1){
            sum += operand3;
        }
        return sum;
    }


}
