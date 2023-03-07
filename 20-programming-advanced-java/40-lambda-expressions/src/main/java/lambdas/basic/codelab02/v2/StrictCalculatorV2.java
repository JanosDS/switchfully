package lambdas.basic.codelab02.v2;

import java.util.function.IntPredicate;

/**
 * Read the README.md file
 */
public class StrictCalculatorV2 {

	public static int multiplyBy2(int operator, IntPredicate rule) {
		if (rule.test(operator)) {
			return operator * 2;
		}
		return 0;
	}

	public static void main(String[] args) {

		IntPredicate rule1 = value -> (value > 0 && value <= 5);
		IntPredicate rule2 = value -> (value < 0 && -4 < value);
		IntPredicate rule3 = value -> (value > 7 && value < 14);
		
		int result1 = StrictCalculatorV2.multiplyBy2(5, rule1);// should use ruleset #1
		int result2 = StrictCalculatorV2.multiplyBy2(-2, rule2); // should use ruleset #2
		int result3 = StrictCalculatorV2.multiplyBy2(8, rule3); // should use ruleset #3

		System.out.println("Should be equal to 10: " + result1);
		System.out.println("Should be equal to -4: " + result2);
		System.out.println("Should be equal to 16: " + result3);
	}

}
