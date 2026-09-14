class Solution {
    public int subsetXORSum(int[] nums) {
        int res =0;
        for(int ele:nums){
            res = res | ele;
        }
        return res << (nums.length-1);
    }
}
