class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int temp = i; temp > 0; temp /= 10) {
                sum += temp % 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
