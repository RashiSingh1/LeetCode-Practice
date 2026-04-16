class Solution {
    public int heightChecker(int[] heights) {
        int n= heights.length;
        int[] expected =  new int[n];
        int count = 0;
        for(int i=0;i<expected.length;i++){
           expected[i] = heights[i];
            }
            Arrays.sort(expected);
            for(int i=0;i<expected.length;i++){
                if(expected[i]!=heights[i]){
                    count++;
                }
            }
        return count;
    }
}
