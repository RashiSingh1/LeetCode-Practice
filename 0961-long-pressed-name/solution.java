class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] ch1 = name.toCharArray();
        char[] ch2 = typed.toCharArray();
        int i = 0, j = 0;
        while (j < ch2.length) {

            if (i < ch1.length && ch1[i] == ch2[j]) {
                i++;
                j++;
            }
            else if (j > 0 && ch2[j] == ch2[j - 1]) {
                j++;
            }
            else {
                return false;
            }
        }
        return i == ch1.length;
    }
}
