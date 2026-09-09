class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length,  half = n / 2;
        long totalSum = 0;
        for (int num: nums) {
            totalSum += num;
        }
        long firstHalfSum = 0;
        for (int i = 0; i < half; i++) {
            firstHalfSum += nums[i];
        }
        int ans = 0;
        for (int r = 0; r < n; r++) {
            long secondHalfSum = totalSum - firstHalfSum;
            if (firstHalfSum > secondHalfSum) {
                ans++;
            }
            firstHalfSum -= nums[r];
            firstHalfSum += nums[(r + half) % n];
        }
        return ans;
    }
}
