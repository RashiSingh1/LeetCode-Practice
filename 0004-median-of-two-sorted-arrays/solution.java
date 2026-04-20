class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length , b= nums2.length;
        int[] result = new int[a+b];
        
        int i = 0, j = 0, k = 0;
        while (i <a && j < b) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (i <a){
            result[k++] = nums1[i++];
        } 
        while (j < b) {
            result[k++] = nums2[j++];
        }
        int n = result.length;
        if (n % 2 == 1) {
            return result[n / 2];
        } else {
            return (result[n/2] + result[n/2 - 1]) / 2.0;
        }
    }
}
