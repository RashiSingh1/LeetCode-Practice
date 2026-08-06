class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length , maxSum =0 , i =0 , j=n-1 , sum =0;
        Arrays.sort(nums);
        while(i<j){
            sum =nums[i++] +nums[j--];
            if(maxSum<sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}