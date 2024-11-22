package Daily;

public class CountUnguardedCellsintheGrid {
    public static void main(String[] args) {
        int  m = 4, n = 6;
        int [][]guards = {{0,0},{1,1},{2,3}};
        int [][]walls = {{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(m,n,guards,walls));

    }

    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
            int [][] grid = new int[m][n];

            for(int []guard : guards){
                int row = guard[0];
                int col = guard[1];

                if (row >= 0 && row < m && col >= 0 && col < n) {
                    grid[row][col] = 1;
                }
            }
            for(int []wall:walls){
                int row = wall[0];
                int col = wall[1];

                if (row >= 0 && row < m && col >= 0 && col < n) {
                    grid[row][col] = 2;
                }
        }

        markGrid(grid);

        System.out.println();
        return 0;


    }

    public static void markGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1: Identify rows and columns to be marked
        boolean[] rowsToUpdate = new boolean[rows];
        boolean[] colsToUpdate = new boolean[cols];

        // Step 2: Traverse the grid to mark the rows and columns that contain a '1'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowsToUpdate[i] = true;
                    colsToUpdate[j] = true;
                }
            }
        }

        // Step 3: Traverse the grid again and apply the marking rule
        // Only place '1' in cells where it's valid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Mark the entire row and column with '1' if needed, but leave '2' unchanged
                if ((rowsToUpdate[i] || colsToUpdate[j]) && grid[i][j] != 1 && grid[i][j] != 2) {
                    grid[i][j] = 1;
                }
            }
        }
    }
    }

