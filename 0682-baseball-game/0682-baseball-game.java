class Solution {
    public int calPoints(String[] operations) {
        int[] num = new int[operations.length];
        int j = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                j--;
                num[j] = 0;
            } 
            else if (op.equals("D")) {
                num[j] = 2 * num[j - 1];
                j++;
            } 
            else if (op.equals("+")) {
                num[j] = num[j - 1] + num[j - 2];
                j++;
            } 
            else {
                num[j] = Integer.parseInt(op);
                j++;
            }
        }

        int sum = 0;
        for (int i = 0; i < j; i++) {
            sum += num[i];
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna