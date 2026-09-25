class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            int rowSum = 0; 
            for(int j = 0; j < matrix[i].length; j++){
                rowSum += matrix[i][j];
            }
            res[i] = rowSum;
        }
        return res;
    }
}
