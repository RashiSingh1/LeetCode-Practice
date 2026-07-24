class Solution {
    public int findClosest(int x, int y, int z) {
       int dist1 = Math.abs(x-z), dist2 = Math.abs(y-z);
       if(dist1>dist2){
        return 2;
       } 
       else if(dist2>dist1){
        return 1;
       }
       return 0;
    }
}