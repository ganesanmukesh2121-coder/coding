class Solution {
    public long removeZeros(long n) {
        String str = String.valueOf(n).replace("0","");
        long num = Long.valueOf(str);
        return num ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna