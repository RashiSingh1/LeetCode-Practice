class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length, median = arr[(n - 1) / 2];
        int left = 0, right = n - 1;
        int[] ans = new int[k];
        int idx = 0;
        while (idx < k) {
            int leftDiff = Math.abs(arr[left] - median);
            int rightDiff = Math.abs(arr[right] - median);
            if (rightDiff > leftDiff) {
                ans[idx++] = arr[right--];
            } else if (rightDiff < leftDiff) {
                ans[idx++] = arr[left++];
            } else {
                if (arr[right] > arr[left]) {
                    ans[idx++] = arr[right--];
                } else {
                    ans[idx++] = arr[left++];
                }
            }
        }
        return ans;
        // for(int i=0;i<n-1;i++){
        //     boolean swapped = false;
        //     for(int j=0;j<n-i-1;j++){
        //         int diff1 = Math.abs(arr[j]- median);
        //         int diff2 = Math.abs(arr[j+1]- median);
        //         if (diff1 < diff2 ||
        //            (diff1 == diff2 && arr[j] < arr[j + 1])) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swapped = true;
        //         }
        //     }
        //     if (!swapped) {
        //         break;
        //     }
        // }
        // int[] ans =new int[k];
        // for(int i=0;i<k;i++){
        //     ans[i] = arr[i];
        // }
        // return ans;
    }
}
