class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int place = 1;
        int ans = 0;

        for (int i = 0; i < 4; i++) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num3 % 10;

            int min = Math.min(d1, Math.min(d2, d3));
            ans += min * place;

            place *= 10;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna