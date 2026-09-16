class Solution {
    static final int MOD = 1_000_000_007;
    public int numberOfSets(int n, int k) {
        int N = n + k - 1;    // total positions
        int R = 2 * k;        // total endpoints of k segments
        if (R > N - R) {
            R = N - R;
        }
        long ans = 1;
        for (int i = 1; i <= R; i++) {
            ans = ans * (N - R + i) % MOD;
            ans = ans * modPower(i, MOD - 2) % MOD;
        }
        return (int) ans;
    }
    private long modPower(long num, long pow) {
        long res = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                res = res * num % MOD;
            }
            num = num * num % MOD;
            pow = pow / 2;
        }
        return res;
    }
}