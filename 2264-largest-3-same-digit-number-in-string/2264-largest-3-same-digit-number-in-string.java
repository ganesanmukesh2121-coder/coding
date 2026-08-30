class Solution {
    public String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE ;
        String s = "" ;
        for(int i = 0 ; i < num.length() - 2 ; i++ ){
           int n = Integer.parseInt(num.substring(i, i + 3)); 
           int p1 = n / 100 ;
           int p2 = (n / 10) % 10 ;
           int p3 = n % 10 ;
           if(p1 == p2 && p2 == p3) {
             if(n > max) {
               max = n ; 
               s = num.substring(i, i + 3) ;  
             }
           }
        }
    return s ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna