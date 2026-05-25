class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i=num.length-1;i>=0 || k>0;i--){
            if(i>=0){
                k = k+num[i];
            }
            res.add(0,k%10);
            k = k/10;
        }
        return res;
    }
}
