class Solution {
    public String reversePrefix(String s, int k) {
        String n = "" ;
        for(int i = k - 1  ; i >= 0 ; i--) {
           n = n + s.charAt(i) ;
        }
        return n + s.substring(k,s.length()) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna