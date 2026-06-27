class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];

        // Count frequency of each cost
        for (int cost : costs) {
            freq[cost]++;
        }

        int count = 0;

        // Buy cheapest ice creams first
        for (int cost = 1; cost <= 100000; cost++) {
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