package dfs;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        int rows = grid.length;

        if (rows == 0) {
            return 0;
        }

        int cols = grid[0].length;

        int[][] visited = new int[rows][cols];
        int islands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    islands++;
                    dfs(grid, visited, i, j, rows, cols);
                }
                visited[i][j] = 1;
            }
        }

        return islands;
    }

    public void dfs(char[][] grid, int[][] visited, int x, int y, int rows, int cols) {

        if (x < 0 || y < 0 || x > rows - 1 || y > cols - 1 || visited[x][y] == 1) {
            return;
        }

        visited[x][y] = 1;

        if (grid[x][y] == '0') {
            return;
        }

        dfs(grid, visited, x + 1, y, rows, cols);
        dfs(grid, visited, x - 1, y, rows, cols);
        dfs(grid, visited, x, y + 1, rows, cols);
        dfs(grid, visited, x, y - 1, rows, cols);
    }
}
