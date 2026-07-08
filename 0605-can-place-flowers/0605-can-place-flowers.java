class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int zeros = 0;
        if (flowerbed[0] == 0) zeros = 1; 
        for (int i = 0; i < flowerbed.length; i++) {         
            if (flowerbed[i] == 0) {
                zeros++;
            } else {
                count += (zeros - 1) / 2;
                zeros = 0;
            }
        }
        if (zeros > 0) {
            count += zeros / 2;
        }  
        return count >= n;
    }
}