

class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);

        long reach = 0;
        for (int coin : coins) {
            if (coin > reach + 1) {
                break;
            }
            reach += coin;
        }

        return (int)(reach + 1);
    }
}
