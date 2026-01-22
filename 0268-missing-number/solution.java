class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long sum = n*(n+1)/2;
        long  numSum =0;
        for(int ele:nums){
            numSum += ele;
        }
        return (int)(sum-numSum);
    }
}
