class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }
    public int solve(int[] nums, int left, int right) {
        if (left == right)
            return nums[left];
        int LeftPick = nums[left] - solve(nums, left + 1, right);
        int RightPick = nums[right] - solve(nums, left, right - 1);
        return Math.max(LeftPick, RightPick);
    }
}