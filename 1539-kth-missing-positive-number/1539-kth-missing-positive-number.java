class Solution {
    public int findKthPositive(int[] arr, int k) {
        int current = 1;
        int index = 0;

        while (k > 0) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                k--;
                if (k == 0) {
                    return current;
                }
            }
            current++;
        }

        return current;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna