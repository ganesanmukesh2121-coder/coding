class Solution {
    public boolean canAliceWin(int n) {
        int move = 10;
        boolean alice = true;

        while (n >= move) {
            n -= move;
            move--;
            alice = !alice;
        }

        return !alice;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna