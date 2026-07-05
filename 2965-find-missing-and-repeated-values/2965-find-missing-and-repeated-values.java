class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n= grid.length;
        int[] count = new int[n*n+1];
        for(int[] row: grid){
            for(int num :row){
                if(count[num]!=0){
                    ans[0] = num;
                }
                else{
                    count[num]++;
                }
            }
        }
          for(int i=1;i<count.length;i++){
            if(count[i]==0){
                ans[1]=i;
                break;
            }
          }
        return ans;
    }
}