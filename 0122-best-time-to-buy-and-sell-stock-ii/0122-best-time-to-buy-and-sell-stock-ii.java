class Solution {
    public int maxProfit(int[] prices) {
        int p = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < prices.length-1 ; i++){
            p = prices[i+1] - prices[i] ;
            if(p > 0){
                max += p ;
            }
        }
        return max ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna