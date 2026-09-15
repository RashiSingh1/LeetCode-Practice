class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length(), count = 0, End = -1;
        for (int i = 0; i < 2 * n - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= k && left > End) {
                    count++;
                    End = right;
                    break;
                }
                left--;
                right++;
            }
        }

        return count;
    }
}