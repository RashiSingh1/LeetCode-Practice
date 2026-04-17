class Solution {
    public int[] transformArray(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];  
     int zeroCount = 0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            result[i] =0;
        }
        else{
            result[i]=1;
        }
      } 
      Arrays.sort(result); 
      return result; 
    }
}
