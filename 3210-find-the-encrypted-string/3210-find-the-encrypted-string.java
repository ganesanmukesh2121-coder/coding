class Solution {
    public String getEncryptedString(String s, int k) {
        int l = s.length() ;
        return s.substring(k % l , l) + "" + s.substring(0 , k % l) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna