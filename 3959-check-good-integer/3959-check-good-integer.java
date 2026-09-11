class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0 ;
        int sq = 0 ;
        while(n > 0){
            sum += n % 10 ;
            sq += (n % 10) * (n % 10) ;
            n /= 10 ;
        }
        return (sq - sum) >= 50 ? true :  false ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna