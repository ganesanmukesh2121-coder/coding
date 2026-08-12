class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }
        for (int i = 0; i < freq.length; i++) {

            if (freq[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < freq.length; j++) {

                if (freq[j] == freq[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna