class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long planetMass = mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (planetMass < asteroids[i]) {
                return false;
            }
            planetMass = planetMass + asteroids[i];
        }
        return true;
    }
}
