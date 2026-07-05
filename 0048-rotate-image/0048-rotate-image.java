class Solution {
    public void rotate(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] =mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            int startcol = 0 , endcol =mat.length-1;
            while(startcol<endcol ){
                int temp= mat[i][startcol];
                mat[i][startcol] = mat[i][endcol];
                mat[i][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
    }
}