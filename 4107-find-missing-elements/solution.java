import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums); 
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            for (int num = current + 1; num < next; num++) {
                result.add(num);
            }
        }
        return result;
    }
}
