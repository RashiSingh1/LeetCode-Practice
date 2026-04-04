class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
       int sum =0;
       int count =0;
       for(int cost : costs){
        if(sum+cost<=coins){
            sum = sum+cost;
            count++;
        }
       }
       return count;
    }
}
