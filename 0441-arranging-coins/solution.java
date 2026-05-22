class Solution {
    public int arrangeCoins(int n) {
        int blocks =0;
        for(int i=0;i<=n;i++){
            blocks =i;
            n=n-blocks;
        }
        return blocks;
    }
}
