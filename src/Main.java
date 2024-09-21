public class Main {
    private static final int SIZE = 10;
    private static int[][] grid = new int[SIZE][SIZE];

    public static void main(String[] args) {
        initializeGrid();
        printGrid();



    }

    public static void evolve() {
        int[][] newGrid = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int neighbors = countNeighbors(i,j);
                if (grid[i][j] == 1) {
                    newGrid[i][j] = (neighbors == 2 || neighbors == 3) ? 1:0;
                } else {
                    newGrid[i][j] = (neighbors == 3) ? 1 : 0;
                }
            }
        }

        grid = newGrid;
    }

    public static int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                    int nextX = x +i;
                    int nextY = y + j;
                    if (nextX >= 0 && nextY >= 0  && nextX < SIZE && nextY < SIZE) {
                        count += grid[nextX][nextY];
                    }
                }
        }
        return count;
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