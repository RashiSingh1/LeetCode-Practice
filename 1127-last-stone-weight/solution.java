class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n= stones.length;
        while(n>1){
            int x= stones[n-2];
            int y=stones[n-1];
            if(x==y){
                n=n-2;
            }
            else{
                stones[n-2] = y-x;
                n=n-1;
            }
            Arrays.sort(stones,0,n);
        }
        if(n==0){
            return 0;
        }
        else{
            return stones[0];
        }
    }
}
