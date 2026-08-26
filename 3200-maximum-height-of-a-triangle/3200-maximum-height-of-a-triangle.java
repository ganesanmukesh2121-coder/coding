class Solution {

    public int maxHeightOfTriangle(int red, int blue) {

        int h1 = 0;
        int r = red;
        int b = blue;

        for (int i = 1; ; i++) {
            if (i % 2 != 0) {
                if (r < i) break;
                r -= i;
            } else {
                if (b < i) break;
                b -= i;
            }
            h1++;
        }

        int h2 = 0;
        r = red;
        b = blue;

        for (int i = 1; ; i++) {
            if (i % 2 != 0) {
                if (b < i) break;
                b -= i;
            } else {
                if (r < i) break;
                r -= i;
            }
            h2++;
        }

        return Math.max(h1, h2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna