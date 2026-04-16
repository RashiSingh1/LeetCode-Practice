class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                int parimeter = nums[i]+nums[i-1]+nums[i-2];
                return parimeter;
            }
        }
        return 0;
    }
}
