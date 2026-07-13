class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int ans=0, req=0;
        Arrays.sort(capacity);
        for (int i = capacity.length - 1; i >= 0; i--) {
            req += capacity[i];
            ans++;
            if (req >= sum) {
                break;
            }
        }
        return ans;
    }
}