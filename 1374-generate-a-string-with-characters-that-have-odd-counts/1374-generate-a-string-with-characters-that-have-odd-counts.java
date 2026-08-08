class Solution {
    public String generateTheString(int n) {
        String o = "" ;
        int k = 0 ;
        if(n % 2 == 1){
            for(int i = 0 ; i < n  ; i++){
              o = o + 'a' ;
            }
        }
        else{
            for(int i = 0 ; i < n - 1; i++){
              o = o + 'b' ;
            }
            o = o + 'c' ;
        }
        
        return o ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna