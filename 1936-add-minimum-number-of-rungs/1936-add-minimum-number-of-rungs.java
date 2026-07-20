class Solution {
    public int addRungs(int[] rungs, int dist) {
        long ans =0 ;
        int prev =0;
        for(int ele: rungs){
            int gap = ele-prev;
            if(gap>dist){
                ans= ans+(gap-1)/dist;

            }
            prev= ele;
        }
        return (int) ans;
    }
}