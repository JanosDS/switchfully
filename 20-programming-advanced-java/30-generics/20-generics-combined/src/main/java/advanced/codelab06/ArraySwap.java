package advanced.codelab06;

public class ArraySwap<E> {


	public E[] arraySwap(E[] array, int i1, int i2) {
		E temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		return array;
	}
}
