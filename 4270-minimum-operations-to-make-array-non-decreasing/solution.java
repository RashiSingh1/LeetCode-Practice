class Solution {
    public long minOperations(int[] nums) {
        long total = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                total += (long)(nums[i] - nums[i + 1]);
            }
        }
        return total;
    }
}
