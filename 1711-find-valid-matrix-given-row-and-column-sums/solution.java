class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][ colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j <  colSum.length; j++) {
                int value = Math.min(rowSum[i], colSum[j]);
                ans[i][j] = value;
                rowSum[i] -= value;
                colSum[j] -= value;
            }
        }
        return ans;
    }
}
