class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int part = sum / 3, temp = 0, count = 0;
        for (int ele : arr) {
            temp += ele;
            if (temp == part) {
                count++;
                temp = 0;
            }
        }
        return count >= 3;
    }
}