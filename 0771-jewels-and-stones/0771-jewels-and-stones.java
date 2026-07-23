class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0 ; i < jewels.length() ; i++){
            char c = jewels.charAt(i) ;
            for(int j = 0 ; j < stones.length() ; j++){
                char n = stones.charAt(j) ;
                if(n == c){
                    count++;
                }
            }
        }
        return count ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna