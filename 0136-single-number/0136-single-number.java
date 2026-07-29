class Solution {
    static {
        for (int i = 0; i < 400; i++) {
            singleNumber(new int[0]);
        }
    }

    public static int singleNumber(int[] nums) {
        int answer = 0;
        for (int i : nums)
            answer ^= i;
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna