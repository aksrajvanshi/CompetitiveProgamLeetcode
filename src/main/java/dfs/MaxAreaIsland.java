/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are
 * surrounded by water.
 *
 * <p>The area of an island is the number of cells with a value 1 in the island.
 *
 * <p>Return the maximum area of an island in grid. If there is no island, return 0.
 */
package dfs;

public class MaxAreaIsland {

    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;

        if (rows == 0) {
            return 0;
        }

        int cols = grid[0].length;

        int[][] visited = new int[rows][cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    maxArea = Math.max(maxArea, dfs(grid, visited, rows, cols, i, j, 0));
                } else {
                    visited[i][j] = 1;
                }

            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int[][] visited, int rows, int cols, int x, int y, int area) {

        if (x < 0 || y < 0 || x > rows - 1 || y > cols - 1 || visited[x][y] == 1) {
            return area;
        }

        if (grid[x][y] == 1) {
            area++;
            visited[x][y] = 1;
        } else {
            visited[x][y] = 1;
            return area;
        }

        area = dfs(grid, visited, rows, cols, x + 1, y, area);
        area = dfs(grid, visited, rows, cols, x - 1, y, area);
        area = dfs(grid, visited, rows, cols, x, y + 1, area);
        area = dfs(grid, visited, rows, cols, x, y - 1, area);

        return area;

    }

}
