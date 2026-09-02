class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int i=0 , ans =0;
        while(n>0){
            nums[i] = start+2*i;
            ans = ans^nums[i];
            i++;
            n--;
        }
        return ans;
    }
}
