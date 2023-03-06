package advanced.codelab01;

public class StringPair implements Pair<String> {
	private String left;
	private String right;

	@Override
	public void store(String t1, String t2) {
		this.left = t1;
		this.right = t2;
	}

	@Override
	public String getLeft() {
		return left;
	}

	@Override
	public String getRight() {
		return right;
	}
}
