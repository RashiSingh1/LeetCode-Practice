class Solution {
    public long maxMatrixSum(int[][] matrix) {
       int min = Integer.MAX_VALUE;
       int negCount =0;
       long sum=0;
       for(int i[] : matrix){
        for(int j :i){
            sum += Math.abs(j);
            min=Math.min(Math.abs(j), min);
            if(j<0){
                negCount++;
            }
        }
       }
       if(negCount%2 == 0) return sum;
       return sum - (2l*(long)min);
    }
}