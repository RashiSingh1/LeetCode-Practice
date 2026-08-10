class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] isWinningState = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (!isWinningState[i - k * k]) {
                    isWinningState[i] = true;
                    break; 
                }
            }
        } 
        return isWinningState[n];
    }
}
