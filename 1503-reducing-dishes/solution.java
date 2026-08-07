class Solution {
public int maxSatisfaction(int[] nums) {
Arrays.sort(nums);
    int maxVlaue=0;
    for(int i=0;i<nums.length;i++){
        int cook=1, sum=0;
        for(int j=i;j<nums.length;j++){
        sum= sum+nums[j]*cook;
        cook++;
        }
        maxVlaue=Math.max(sum,maxVlaue);
    }
    return  maxVlaue;
}
}
