class Solution {
    public String winningPlayer(int x, int y) {
        int A = 0 ;
        while(x > 0 && y >= 4 ) {
           x-- ;
           y -= 4 ;
           A++ ;
        }
      return (A % 2 != 0) ? "Alice" : "Bob" ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna