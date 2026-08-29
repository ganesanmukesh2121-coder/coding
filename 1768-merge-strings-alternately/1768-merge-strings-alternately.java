class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder() ;
        int min = Math.min(word1.length(),word2.length());
        for(int i = 0 ; i < min ; i++){
            s.append(word1.charAt(i)+"") ;
            s.append(word2.charAt(i)+"") ;
        }
        if(min < word1.length()){
            s.append(word1.substring(min,word1.length()));
        }else if(min < word2.length()){
            s.append(word2.substring(min,word2.length()));
        }
        return new String(s) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna