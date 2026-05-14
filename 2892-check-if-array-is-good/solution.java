class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int count = 1; 
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        if ((n > count + 1) || (n == 1)) {
            return false;
        }
         return (nums[n - 1] == count) && (nums[n - 2] == count);
    }
}
