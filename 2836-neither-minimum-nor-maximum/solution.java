class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min =nums[0];
        int max = nums[0];
        for(int ele : nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        for (int ele : nums) {
            if (ele != min && ele != max) {
                return ele;
            }
        }

        return -1;
    }
}
