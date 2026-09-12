class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        long[][] dp = new long[5][n + 1];
        long NEG = Long.MIN_VALUE / 2;
        for (int r = 1; r <= 4; r++) {
            dp[r][0] = NEG;
        }
        int[][][] ans = new int[5][n + 1][4];
        for (int r = 0; r <= 4; r++) {
            for (int i = 0; i <= n; i++) {
                Arrays.fill(ans[r][i], -1);
            }
        }
        for (int i = 1; i <= n; i++) {
            int current = i - 1;
            for (int r = 1; r <= 4; r++) {
                dp[r][i] = dp[r][i - 1];
                copy(ans[r][i - 1], ans[r][i]);
                int j = findPrevious(arr, current);
                if (dp[r - 1][j + 1] != NEG) {
                    long choose =
                            arr[current][2] + dp[r - 1][j + 1];
                    int[] temp = new int[4];
                    Arrays.fill(temp, -1);
                    copy(ans[r - 1][j + 1], temp);
                    addIndex(temp, arr[current][3]);
                    if (choose > dp[r][i]) {
                        dp[r][i] = choose;
                        copy(temp, ans[r][i]);

                    } else if (choose == dp[r][i]) {
                        if (isSmaller(temp, ans[r][i])) {
                            copy(temp, ans[r][i]);
                        }
                    }
                }
            }
        }
        long maxScore = NEG;
        int[] result = new int[4];
        Arrays.fill(result, -1);
        for (int r = 1; r <= 4; r++) {
            if (dp[r][n] > maxScore) {
                maxScore = dp[r][n];
                copy(ans[r][n], result);

            } else if (dp[r][n] == maxScore) {
                if (isSmaller(ans[r][n], result)) {
                    copy(ans[r][n], result);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (result[i] != -1) {
                count++;
            }
        }
        int[] finalAnswer = new int[count];
        for (int i = 0; i < count; i++) {
            finalAnswer[i] = result[i];
        }
        return finalAnswer;
    }

    // Fnction for Finding last interval whose right < current left

    private int findPrevious(int[][] arr, int current) {
        int left = 0 , right = current - 1,  ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid][1] < arr[current][0]) {
                ans = mid;
                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }
        return ans;
    }

    // Function for Adding original index and keep indices sorted

    private void addIndex(int[] arr, int value) {
    for (int i = 0; i < 4; i++) {
        if (arr[i] == -1) {
            arr[i] = value;
            break;
        }
    }
    for (int i = 0; i < 3; i++) {

        if (arr[i] == -1) {
            break;
        }
        for (int j = i + 1; j < 4; j++) {
            if (arr[j] != -1 && arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
    private void copy(int[] source, int[] destination) {
        for (int i = 0; i < 4; i++) {
            destination[i] = source[i];
        }
    }

    // Function for Lexicographically smaller array

    private boolean isSmaller(int[] a, int[] b) {
        for (int i = 0; i < 4; i++) {
            if (a[i] != b[i]) {
                if (a[i] == -1) {
                    return false;
                }
                if (b[i] == -1) {
                    return true;
                }
                return a[i] < b[i];
            }
        }
        
        return false;
    }
}
