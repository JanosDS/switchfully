package lambdas.basic.codelab02.v1;

/**
 * Read the README.md file
 */
public class StrictCalculatorV1 {

	public static int multiplyBy2(int operator, Ruleset rule) {
		if (rule.isValid(operator)) {
			return operator * 2;
		}
		return 0;
	}

	public static void main(String[] args) {
		int result1 = StrictCalculatorV1.multiplyBy2(5, new Ruleset() {
			public boolean isValid(int x) {
				return (x > 0 && x <= 5);
			}
		});// should use ruleset #1
		int result2 = StrictCalculatorV1.multiplyBy2(-2, new Ruleset() {

			public boolean isValid(int x) {
				return (x < 0 && -4 < x);
			}
		}); // should use ruleset #2
		int result3 = StrictCalculatorV1.multiplyBy2(8, new Ruleset() {

			public boolean isValid(int x) {
				return (x > 7 && x < 14);
			}
		}); // should use ruleset #3

		System.out.println("Should be equal to 10: " + result1);
		System.out.println("Should be equal to -4: " + result2);
		System.out.println("Should be equal to 16: " + result3);
	}

}
