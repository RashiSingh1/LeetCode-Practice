class Solution {
    public int diagonalSum(int[][] mat) {
        int m=0;
        int n=mat.length-1;
        int sum=0;
        for(int i=0;i<=mat.length-1;i++)
        {
            sum+= mat[m][m];
            if(m!=n)
            {
                sum+= mat[m][n];
            }
            m++;
            n--;

        }
        return sum;
    
    }
}
