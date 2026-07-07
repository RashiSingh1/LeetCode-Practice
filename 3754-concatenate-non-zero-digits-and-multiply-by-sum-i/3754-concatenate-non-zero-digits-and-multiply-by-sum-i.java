class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long sum =0 , x =0;
        for(int i=0;i<s.length();i++){
            int curr = s.charAt(i) - '0';
            if(curr>0){
                sum = sum+curr;
                x=  x*10+curr;
            }
        }
        return sum*x;
    }
}