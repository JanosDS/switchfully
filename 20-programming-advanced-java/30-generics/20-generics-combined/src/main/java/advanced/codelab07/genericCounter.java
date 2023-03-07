package advanced.codelab07;

import java.util.Collection;

public class genericCounter<E> {

	private Filter<E> filter;


	public genericCounter(Filter<E> filter) {
		this.filter = filter;
	}

	public int count(Collection<E> collection) {
		int counter = 0;

		return counter;
	}

}
