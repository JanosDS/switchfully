package basic;

import java.util.Arrays;

public class ArraysCodelab02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(createArray())));
    }

    /**
     * Complete this method so that it creates an empty int array of length 10
     */
    public static int[] createArray() {
        return new int[10];
    }

    /**
     * Complete this method so that it fills the given array with the numbers 1 to 10
     */
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        return array;
    }

    /**
     * Use the '{}' operator to create and immediately initialize an array with the strings "a" until "k"
     */
    public static String[] createAndFillArray() {
        return new String[]{"a", "b", "c", "d", "e", "f","g","h","i","j","k"};
    }
}
