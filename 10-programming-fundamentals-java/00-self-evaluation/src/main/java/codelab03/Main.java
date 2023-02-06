package codelab03;

/**
 * Read the README.md for the assignment
 */
public class Main {

    public static char[][] createArrayForSize(int size) {
        char[][] array = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || i == size-1){
                    array[i][j] = '@';
                }
                else if(j == 0 || j == size-1){
                    array[i][j] = '@';
                }
                else {
                    array[i][j] = ' ';
                }
            }
        }
        return array;
    }

}
