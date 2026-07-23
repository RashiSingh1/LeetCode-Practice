class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int ele : nums){
            while(ele>0){
                if(ele%10 == digit) ans++;
                ele /=10;
            }
        }
        return ans;
    }
}
