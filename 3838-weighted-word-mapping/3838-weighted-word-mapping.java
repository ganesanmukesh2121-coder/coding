class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String n = "" ;
        for(String s : words) {
            int sum = 0 ;
            for(int i = 0 ; i < s.length() ; i++){
                int c = (int)(s.charAt(i) - 'a') ;
                sum += weights[c] ; 
            }
            int m = sum % 26 ;
            n = n + (char)('z' - m ) ;
        }
        return n ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna