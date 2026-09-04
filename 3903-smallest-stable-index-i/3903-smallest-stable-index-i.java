class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length , max = -1;;
        int[]ans = new int[n];
        for(int i = 0;i<n;i++){
            max = Math.max(max,nums[i]);
            ans[i]+=max;
        }
        int min = Integer.MAX_VALUE;
        for(int i = n-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            ans[i]-=min;
        }
        for(int i = 0;i<n;i++){
            if(ans[i]<=k){
                return i;
            }
        }
        return -1;
    }
}