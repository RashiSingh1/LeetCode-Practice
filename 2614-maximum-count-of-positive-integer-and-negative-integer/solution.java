class Solution {
    public int maximumCount(int[] nums) {
        int result=0;
        int pos =0;
        int neg=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
           result = Math.max(pos,neg);
        }
        return result;
    }

}
