class Solution {
    public int smallestNumber(int n) {
        int bits = 0;
        int temp = n;

        while (temp > 0) {
            bits++;
            temp >>= 1;
        }

        return (1 << bits) - 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna