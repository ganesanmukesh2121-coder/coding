import java.util.Arrays;

class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int prev = 0;

        for (int num : nums) {
            if (num > 0 && num != prev) {
                count++;
                prev = num;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna