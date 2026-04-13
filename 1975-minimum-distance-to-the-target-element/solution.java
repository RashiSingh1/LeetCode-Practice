class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                n = Math.min(n, Math.abs(i - start));
            }
        }
        return n;
    }
}
