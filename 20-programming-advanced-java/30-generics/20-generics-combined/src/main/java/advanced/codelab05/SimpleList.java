package advanced.codelab05;

import java.util.Arrays;
import java.util.List;

public class SimpleList<E> implements List<E> {


	private E[] array;

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public boolean add(E e) {
		E[] tempArray = new E[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		tempArray[tempArray.length] = e;
		array = tempArray;
		return true;
	}

	@Override
	public E get(int index) {
		return array[index];
	}
}
