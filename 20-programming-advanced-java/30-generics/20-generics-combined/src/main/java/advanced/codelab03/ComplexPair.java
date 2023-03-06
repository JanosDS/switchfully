package advanced.codelab03;

public class ComplexPair<T, E> implements Pair<T, E> {

	private T left;
	private E right;

	public ComplexPair(T left, E right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void store(T t1, E o) {

	}

	@Override
	public T getLeft() {
		return left;
	}

	@Override
	public E getRight() {
		return right;
	}
}
