class Solution {
    public String truncateSentence(String s, int k) {
        String[] out = s.split(" ") ;
        String r = "";
        for(int i = 0 ; i < k ; i++){
            if(i < k-1){
              r = r + out[i] + " ";
            }
            else{
                r = r + out[i];
            }
        }
    return r ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna