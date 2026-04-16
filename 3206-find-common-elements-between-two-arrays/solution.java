import java.util.Arrays;
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    result[0]++;
                    break;
                }
            }
        }
         for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    result[1]++;
                    break;
                }
            }
        }
        return result;
    }

}
