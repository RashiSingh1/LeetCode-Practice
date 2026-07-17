class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum =0 ;
        for(int ele : nums){
            sum = sum+ele;
        }
        long diff = Math.abs((long) goal - sum);
        int ans = (int) ((diff + limit - 1) / limit);
        return ans;
    }
}
