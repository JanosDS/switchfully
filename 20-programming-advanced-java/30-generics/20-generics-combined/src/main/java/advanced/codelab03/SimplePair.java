package advanced.codelab03;

import advanced.codelab02.Pair;

public class SimplePair<E> implements Pair<E> {

	private E left;
	private E right;

	public SimplePair(E left, E right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void store(E e1, E e2) {
		this.left = e1;
		this.right = e2;
	}

	@Override
	public E getLeft() {
		return left;
	}

	@Override
	public E getRight() {
		return right;
	}
}
