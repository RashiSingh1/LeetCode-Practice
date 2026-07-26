class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length ,  ans =0 , prev = -1;
        for(int i=0;i<n;i++){
            if(forts[i]!=0){
                if (prev != -1 && forts[i] != forts[prev]) {
                    ans = Math.max(ans, i - prev - 1);
                }
                prev=i;
            }
        }
        return ans;
    }
}