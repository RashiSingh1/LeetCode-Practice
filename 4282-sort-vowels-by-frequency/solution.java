import java.util.*;

public class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[256];
        int[] firstOccur = new int[256];
        Arrays.fill(firstOccur, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
            if (firstOccur[c] == -1) firstOccur[c] = i;
        }
        List<Character> extractedVowels = new ArrayList<>();
        List<Integer> vowelIndices = new ArrayList<>();
        String vowelsStr = "aeiou";       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowelsStr.indexOf(c) != -1) {
                extractedVowels.add(c);
                vowelIndices.add(i);
            }
        }
        Collections.sort(extractedVowels, (a, b) -> {
            if (freq[a] != freq[b]) {
                return freq[b] - freq[a]; 
            }
            return firstOccur[a] - firstOccur[b]; 
        });
        char[] result = s.toCharArray();
        for (int i = 0; i < vowelIndices.size(); i++) {
            result[vowelIndices.get(i)] = extractedVowels.get(i);
        }
        return new String(result);
    }
}

