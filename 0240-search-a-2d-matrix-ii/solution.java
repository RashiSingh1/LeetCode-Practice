class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ele : matrix) {
            for (int value : ele) {
                if (value == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
