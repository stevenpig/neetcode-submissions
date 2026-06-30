class Solution {

     int[][] dir = new int[][] {{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

    public int numIslands(char[][] grid) {
        
       

        int count = 0;
        for (int i = 0 ; i < grid.length; i++) {
            for (int j = 0 ; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    flipToZero(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void flipToZero(char[][] grid, int i, int j) {
        
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            for (int m = 0; m < dir.length; m++) {
                int newX = i + dir[m][0];
                int newY = j + dir[m][1];
                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length) {
                    flipToZero(grid, newX, newY);
                }
            }
        }

    }
}
