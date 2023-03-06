package advanced.codelab01;

public class Box<T> {


	private T t;

	public void store(T t) {
		this.t = t;
	}

	public T getContentOfBox() {
		return t;
	}
}
