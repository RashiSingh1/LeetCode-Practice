class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] columns = new int[n];
        for(int[] index : indices){
            rows[index[0]]++;
            columns[index[1]]++;
        }
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rows[i]+columns[j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
