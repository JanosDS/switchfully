package advanced.codelab03;

import java.util.*;

public class BattleshipApplication {

    public static void main(String[] args) {
        Grid grid = new Grid();
        System.out.println(grid.toString());

        int[] coord = askCoords();
        if (grid.tryHit(coord)) {
            System.out.println("Gratz u hit");
        }
        
    }

    public static int[] askCoords() {
        int[] coord = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("X coord: ");
        coord[0] = sc.nextInt();
        System.out.println("Y coord: ");
        coord[1] = sc.nextInt();
        return coord;
    }

}
