class Solution {
    public String restoreString(String s, int[] indices) {
        char[] n = new char[s.length()];
        for(int i = 0 ; i < indices.length ; i++){
            n[indices[i]] = s.charAt(i) ;
        }
     return new String(n) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna