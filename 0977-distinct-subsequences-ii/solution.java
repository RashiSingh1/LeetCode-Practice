class Solution {
    public int distinctSubseqII(String s) {
        long[] end = new long[26];
        long result =0, mod = (long)1e9 +7;
        for(char ch:s.toCharArray()){
            int idx = ch-'a';
            long  newCount = (result+1)%mod;
            long old = end[idx];
            end[idx] = newCount;
            result =(result+newCount-old+mod)%mod;
        }
        return (int) result;
    }
}
