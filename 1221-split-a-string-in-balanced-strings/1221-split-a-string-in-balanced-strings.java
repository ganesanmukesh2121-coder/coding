class Solution {
    public int balancedStringSplit(String s) {
        int count = 0 ;
        int b = 0 ;

        for( int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            if(c == 'R'){
                b++;
            }
            else{
                b--;
            }
            if(b == 0){
                count++;
            }
        }
        return count ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna