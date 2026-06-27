class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        // Find the maximum cost
        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }

        // Frequency array
        int[] freq = new int[maxCost + 1];

        for (int cost : costs) {
            freq[cost]++;
        }

        int count = 0;

        // Buy the cheapest ice creams first
        for (int cost = 1; cost <= maxCost && coins >= cost; cost++) {
            while (freq[cost] > 0 && coins >= cost) {
                coins -= cost;
                freq[cost]--;
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna