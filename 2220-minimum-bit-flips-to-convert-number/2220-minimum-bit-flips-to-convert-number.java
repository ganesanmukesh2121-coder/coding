class Solution {
    public int minBitFlips(int start, int goal) {
        int flip = start ^ goal ;
        int count = 0 ;
        while(flip != 0){
            flip &= flip - 1 ;
            count ++ ;
        }
        return count ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna