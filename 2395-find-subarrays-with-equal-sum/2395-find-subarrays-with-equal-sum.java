class Solution {
    public boolean findSubarrays(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum1 = nums[i] + nums[i + 1];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int sum2 = nums[j] + nums[j + 1];
                if (sum1 == sum2) {
                    return true;
                }
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna