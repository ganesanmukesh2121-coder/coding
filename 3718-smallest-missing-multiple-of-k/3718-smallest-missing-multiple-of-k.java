class Solution {
    public int missingMultiple(int[] nums, int k) {

        for (int i = k; ; i += k) {
            boolean flag = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return i;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna