class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans =0 , n= img1.length;
        var count = new int[n*2][n*2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==0){
                    continue;
                }
                for(int k=0;k<n;k++){
                    for(int s = 0;s<n;s++){
                        if(img2[k][s]==0){
                            continue;
                        }
                        ans = Math.max(ans, ++ count[n + i - k][n + j - s]);
                    }
                }
            }
        }
        return ans;
    }
}
