package advanced.codelab03;

import java.util.*;

public class BattleshipApplication {

    public static void main(String[] args) {
        Grid grid = new Grid();
        System.out.println(grid.toString());

        while (!grid.isGAME_OVER()) {
            int[] coord = askCoords();
            if (grid.markGrid(coord)) {
                System.out.println("Gratz u hit");
            }
            System.out.println(grid.toString());
        }
        System.out.println("You won!");
    }

    public static int[] askCoords() {
        int[] coord = new int[2];
        Scanner sc = new Scanner(System.in);
        coord[0] = 0;
        while (coord[1] <= 0 || coord[1] > 10) {
            System.out.println("X coord: ");
            coord[1] = sc.nextInt();
        }
        while (coord[0] <= 0 || coord[0] > 10) {
            System.out.println("Y coord: ");
            coord[0] = sc.nextInt();
        }
        return coord;
    }

}
