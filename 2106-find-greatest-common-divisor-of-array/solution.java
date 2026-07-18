class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max= nums[0];
        for(int ele : nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        while(max%min!=0){
            int rem = max%min;
            max = min;
            min = rem;
        }
        return min;
    }
}
