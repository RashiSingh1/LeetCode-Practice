class Solution {
    public int brokenCalc(int startValue, int target) {
        int operation=0;
        while(target> startValue){
            if(target%2==0){
                target /= 2;
            }
            else{
                target++;
            }
            operation++;
        }
        int ans = operation+(startValue-target);
        return ans;
    }
}