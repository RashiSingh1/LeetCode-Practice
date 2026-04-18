class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n= nums.length;
        int[] answer = new int[n];
        
        for(int i=0, product =1;i<n;i++){
           answer[i] = product;
           product = product*nums[i];
        }
        for(int i= n-1, product=1;i>=0;i--){
            answer[i] = answer[i]*product;
            product = product*nums[i];
        }
        return answer;
    }
}
