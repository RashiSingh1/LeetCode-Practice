class Solution {
    public int countElements(int[] nums) {
        int minIdx = Integer.MAX_VALUE;
        int maxIdx = Integer.MIN_VALUE;
        for(int ele: nums){
            minIdx = Math.min(minIdx,ele);
            maxIdx = Math.max(maxIdx , ele);
        }
        int count =0;
        for(int ele: nums){
            if(ele>minIdx && ele<maxIdx){
                count++;
            }
        }
        return count;
    }
}
