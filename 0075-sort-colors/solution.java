class Solution {
    public void sortColors(int[] nums) {
        int zeroCount =0;
        int OneCount = 0;
        int twoCount =0;
        for(int ele: nums){
            if(ele==0){
                zeroCount++;
            }
            else if(ele==1){
                OneCount++;
            }
            else twoCount++;
        }
        for(int i = 0; i < zeroCount; i++){
            nums[i] = 0;
        }
        for(int i = zeroCount; i <zeroCount+ OneCount; i++){
            nums[i] = 1;
        }
        for(int i =zeroCount+OneCount;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
