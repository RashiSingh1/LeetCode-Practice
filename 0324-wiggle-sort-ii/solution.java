class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] temp = new int[n];
        int left = (n - 1) / 2; 
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                temp[i] = nums[left--];
            } else {
                temp[i] = nums[right--];
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
