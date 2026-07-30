class Solution {
    public int minChanges(int n, int k) {
        int count = 0;

        while (n > 0 || k > 0) {
            int bitN = n & 1;
            int bitK = k & 1;

            if (bitN == 0 && bitK == 1) {
                return -1;
            }

            if (bitN == 1 && bitK == 0) {
                count++;
            }

            n >>= 1;
            k >>= 1;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna