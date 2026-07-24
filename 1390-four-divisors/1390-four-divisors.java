class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int ele : nums) {
            int count = 0, sum = 0;
            for (int i = 1; i * i <= ele; i++) {
                if (ele % i == 0) {
                    if (i == ele / i) {
                        count++;
                        sum += i;
                    } else {
                        count += 2;
                        sum += i + ele / i;
                    }
                    if (count > 4) {
                        break;
                    }
                }
            }
            if (count == 4) {
                ans += sum;
            }
        }
        return ans;
    }
}