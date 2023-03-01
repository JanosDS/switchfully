package basic.codelab02;

public class TvApplication {
	public static void main(String[] args) {
		Television tv = new Television();
		try {
			tv.turnOn();
			tv.plugIn();
			tv.switchChannelTo(90);
		} catch (IllegalArgumentException illegalArg) {
			System.err.println("INVALID ARGUMENT: " + illegalArg.getMessage());
		} catch (IllegalStateException illegalState) {
			System.err.println(illegalState.getMessage());
		} finally {
			System.out.println(tv.toString());
		}
	}
}
