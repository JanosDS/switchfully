package basic;

public class LoopsCodelabs06 {

    /**
     * Create a merge function that merges two arrays into one.
     * The merge function must mix the elements like a zipper
     * E.G. merge({1,2,3}{1,2,3}) -> {1,1,2,2,3,3}
     * <p>
     * If both arrays are of a different length return an empty array
     */
    public static int[] merge(int[] array1, int[] array2) {
       if(array1.length != array2.length){
           return new int[0];
       }
       int[] array = new int[array1.length + array2.length];
       int smallIndex = 0;
       for(int i = 0; i < array.length; i++){
           if(i%2 == 0){
               array[i] = array1[smallIndex];
           }
           else {
               array[i] = array2[smallIndex];
               smallIndex++;
           }
       }
       return array;
    }
}
