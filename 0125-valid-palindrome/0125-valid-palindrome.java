class Solution {
    public boolean isPalindrome(String s) {
        String n = "" ;
        String o = "" ;
        s = s.toLowerCase() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                n = n + s.charAt(i) ;
            }
        }
        for(int i = n.length() - 1 ; i >= 0 ; i--){
            o = o + n.charAt(i) ;
        }

        return n.equals(o) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna