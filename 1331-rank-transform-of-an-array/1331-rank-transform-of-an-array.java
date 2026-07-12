class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] unique = new int[sorted.length];
        int k = 0;
        for (int num : sorted) {
            if (k == 0 || unique[k - 1] != num) {
                unique[k++] = num;
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = Arrays.binarySearch(unique, 0, k, arr[i]) + 1;
        }
        return ans;
    }
}