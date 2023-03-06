package advanced.codelab02;

public interface Pair<T> {

	void store(T t1, T t2);
	T getLeft();
	T getRight();
}
