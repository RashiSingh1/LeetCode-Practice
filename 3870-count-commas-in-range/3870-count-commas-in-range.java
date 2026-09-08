class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int ans =0;
        // for(int i=1000;i<=n;i++){
         for (int i = 1; i <= n; i++){
            if(i>=1000){
                ans++;
            }
        }
        return ans;
    }
}