package advanced.codelab01;

public class IntegerPair implements Pair<Integer> {

	private Integer left;
	private Integer right;

	@Override
	public void store(Integer t1, Integer t2) {
		this.left = t1;
		this.right = t2;
	}

	@Override
	public Integer getLeft() {
		return left;
	}

	@Override
	public Integer getRight() {
		return right;
	}
}
