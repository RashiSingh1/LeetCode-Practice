class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int k=0, n = nums.length;
        int[] ans = new int[n];  
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[k++] = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[k++] = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[k++] = nums[i];
            }
        }
        return ans;
    }
}
