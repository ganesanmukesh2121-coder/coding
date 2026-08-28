class Solution {
    public int minOperations(int[] nums, int k) {

        int max = 0;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }

            if (num < k) {
                return -1;
            }
        }

        int[] arr = new int[max + 1];

        for (int num : nums) {
            arr[num]++;
        }

        int count = 0;

        for (int i = k + 1; i <= max; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna