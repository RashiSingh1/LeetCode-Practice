class Solution {
    public boolean checkPossibility(int[] nums) {
        int changes = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                changes++;

                if (changes > 1) return false;

                // Decide which element to adjust
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];  // Increase next element
                } else {
                    nums[i] = nums[i + 1];  // Decrease current element
                }
            }
        }
        return true;
    }
}

