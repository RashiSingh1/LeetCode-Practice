class Solution {
    public int arraySign(int[] nums) {
        int sign =1;
        for(int ele : nums){
            if(ele==0){
                return 0;
            }
            else if(ele<0){
                sign = sign*-1;
            }
            else{
                sign = sign*1;
            }
        }
        return sign;
    }
}
