class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                boolean same = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[row][k] != grid[k][col]) {
                        same = false;
                        break;
                    }
                }
                if (same)
                    ans++;
            }
        }
        return ans;
    }
}