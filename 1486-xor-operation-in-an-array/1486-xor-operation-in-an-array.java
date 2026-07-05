class Solution {
    public int xorOperation(int n, int start) {
        int[] nums =new int[n];
        int result = 0;
        for(int i = 0;i < n;i++){
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna