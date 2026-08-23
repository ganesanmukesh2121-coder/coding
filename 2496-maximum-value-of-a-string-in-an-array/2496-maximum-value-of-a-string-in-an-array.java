class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];
            boolean hasLetter = false;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    hasLetter = true;
                    break;
                }
            }

            int value;

            if (hasLetter) {
                value = s.length();
            } else {
                value = Integer.parseInt(s);
            }

            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna