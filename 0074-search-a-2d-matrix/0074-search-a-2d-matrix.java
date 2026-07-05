class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         for(int[] ele : matrix){
            for( int a : ele){
                if(a==target){
                    return true;
                }
            }
         }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j= 0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        return false;
    }
}