// LeetCode - Q.200_Number of Islands
public class practice04 {
	public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '#';
        if(row < grid.length - 1 && grid[row+1][col] == '1') {
            dfs(grid, row+1, col);
        }
        if(row > 0 && grid[row-1][col] == '1') {
            dfs(grid, row-1, col);
        }
        if(col > 0 && grid[row][col-1] == '1') {
            dfs(grid, row, col-1);
        }
        if(col < grid[row].length-1 && grid[row][col+1] == '1') {
            dfs(grid, row, col+1);
        }
    }
}
