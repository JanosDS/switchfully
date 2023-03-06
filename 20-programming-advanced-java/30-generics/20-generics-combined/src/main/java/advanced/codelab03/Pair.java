package advanced.codelab03;

public interface Pair<T, T2> {

	void store(T t1, T2 t2);
	T getLeft();
	T2 getRight();
}
