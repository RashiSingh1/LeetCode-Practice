class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left = 0, right = piles.length - 1,  ans = 0;
        while (left < right) {
            right--;             
            ans += piles[right];    
            right--;                 
            left++;                 
        }
        return ans;
    }
}