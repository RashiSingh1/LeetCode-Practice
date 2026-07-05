class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow = 0;
        int maxOnes = 0;
        for (int i = 0; i < mat.length; i++) {
            int ones = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }
            if (ones > maxOnes) {
                maxOnes = ones;
                maxRow = i;
            }
        }
        return new int[]{maxRow, maxOnes};
    }
}
