class Solution {
    public int scoreOfString(String s) {
        int i = 0 ;
        int j = i + 1 ;
        int sum = 0 ;
        while(i < s.length() - 1){
            sum += Math.abs(s.charAt(i) - s.charAt(j)) ; 
            i++;
            j++;
        }
        return sum ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna