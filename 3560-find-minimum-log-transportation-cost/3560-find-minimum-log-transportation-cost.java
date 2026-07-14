class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cost = 0;
        if (n > k) {
            cost += 1L * k * (n - k);
        }
        if (m > k) {
            cost += 1L * k * (m - k);
        }
        return cost;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna