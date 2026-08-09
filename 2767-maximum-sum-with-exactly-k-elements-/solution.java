class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int score = 0;
        for (int i = 0; i < k; i++) {
            score += max;
            max++;
        }
        return score;
    }
}
