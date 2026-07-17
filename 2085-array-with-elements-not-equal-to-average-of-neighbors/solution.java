class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i+1<nums.length;i=i+2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1]= temp;
        }
        return nums;
    }
}
