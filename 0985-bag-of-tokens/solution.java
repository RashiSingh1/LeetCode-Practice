class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n= tokens.length;
        int maxScore =0 , currScore =0;
        Arrays.sort(tokens);
        for(int i=0;i<n;i++){
            if(currScore ==0 && tokens[i]>power){
                return maxScore;
            }
            if(tokens[i]<=power){
                currScore++;
                power = power-tokens[i];
            }
            else{
                currScore--;
                power = power+tokens[n-1];
                n--;
                i--;
            }
            maxScore = Math.max(maxScore,currScore);
        }
        return maxScore;
    }
}
