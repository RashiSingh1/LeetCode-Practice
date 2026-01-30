import java.util.*;

class Solution {
    public int[] rotateElements(int[] nums, int k) {
        
        // Step 1: Store non-negative values
        List<Integer> values = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) {
                values.add(num);
            }
        }
        
        int m = values.size();
        if (m == 0) return nums;  // No non-negative elements
        
        // Step 2: Effective left rotation
        k = k % m;
        
        // Step 3: Rotate the values list
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(values.subList(k, m));
        rotated.addAll(values.subList(0, k));
        
        // Step 4: Put rotated values back into original array
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(index++);
            }
        }
        
        return nums;
    }
}

