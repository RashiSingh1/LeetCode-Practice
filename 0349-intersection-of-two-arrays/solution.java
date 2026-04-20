
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i > 0 && nums1[i] == nums1[i - 1]) continue;
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[index++] = nums1[i];
                    break; 
                }
            }
        }
        return Arrays.copyOf(temp, index);
    }
}
