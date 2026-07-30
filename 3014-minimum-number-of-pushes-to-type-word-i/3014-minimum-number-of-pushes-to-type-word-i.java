class Solution {
    public int minimumPushes(String word) {
        int count = 0 ;
        int num = word.length() ;
        while(num > 0){
            if(num > 24){
                count += 4 ;
            }
            else if(num > 16){
                count += 3 ;
            }
            else if(num > 8){
                count += 2 ;
            }
            else{
                count++ ;
            }
            num--;
        }
        return count ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna