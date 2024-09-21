//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int SIZE = 10;
    private static int[][] grid = new int[SIZE][SIZE];

    public static void main(String[] args) {
        initializeGrid();
        printGrid();



    }

    public static int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {

                }
            }

        }
    }

    private static void printGrid() {
        for (int i = 0; i < SIZE; i ++) {
            for  (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initializeGrid() {
        for (int i =0; i < SIZE; i++) {
            for (int j = 0; i <  SIZE; j++) {
                // randomly will populate the grid
                grid[i][j] = Math.random() > 0.5 ? 1:0;
            }
        }
    }
}