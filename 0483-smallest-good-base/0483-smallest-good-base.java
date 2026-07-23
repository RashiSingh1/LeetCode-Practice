public class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        if (num <= 3) {
            return String.valueOf(num - 1);
        }
        for (int m = (int)(Math.log(num + 1) / Math.log(2)); m >= 1; m--) {
            long k = (long)Math.pow(num, 1.0 / m);
            long sum = 0;
            long base = 1;
            for (int i = 0; i <= m; i++) {
                sum += base;
                base *= k;
            }
            if (sum == num) {
                return String.valueOf(k);
            }
        }
        return String.valueOf(num - 1);
    }
}