class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length , left = 0, sum = 0,  res = Integer.MAX_VALUE;
        int[] best = new int[n];
        for (int right = 0; right < n; right++) {
            sum= sum+ arr[right];
            while (sum > target) {
                sum =sum-arr[left];
                left++;
            }
            if (right > 0) {
                best[right] = best[right - 1];
            }
            if (sum == target) {
                int length = right - left + 1;
                if (left > 0 && best[left - 1] != 0) {
                    res = Math.min(res,length + best[left - 1]);
                }
                if (best[right] == 0) {
                    best[right] = length;
                } else {
                    best[right] = Math.min(best[right], length);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
