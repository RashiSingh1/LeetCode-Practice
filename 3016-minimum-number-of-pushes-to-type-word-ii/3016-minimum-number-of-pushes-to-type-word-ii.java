class Solution {
    public int minimumPushes(String word) {
        int a[] = new int[26];
        for(char ch:word.toCharArray()){
            a[ch-'a']++;
        }
        Arrays.sort(a);
        int idx =1 ,sum = 0 , count=1;
        for(int i=25;i>=0;i--){
            if(idx<=8){
                idx++;
            }
            else{
                idx =2;
                count++;
            }
            sum = sum+(a[i]*count);
        }
        return sum;
    }
}