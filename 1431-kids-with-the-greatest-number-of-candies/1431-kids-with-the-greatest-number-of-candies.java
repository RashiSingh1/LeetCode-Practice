class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max= 0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max, candies[i]);
        }
        int k=0;
        for(int i=0;i<candies.length;i++){
            k = candies[i]+extraCandies;
            if(k>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}