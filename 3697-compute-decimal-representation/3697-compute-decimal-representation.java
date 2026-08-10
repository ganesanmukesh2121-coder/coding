class Solution {
    public int[] decimalRepresentation(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        int place = 1;
        int index = count - 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                arr[index] = digit * place;
            }
            index--;
            place *= 10;
            n /= 10;
        }
        int size = 0;
        for (int num : arr) {
            if (num != 0) {
                size++;
            }
        }
        int[] result = new int[size];
        int j = 0;
        for (int num : arr) {
            if (num != 0) {
                result[j++] = num;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna