class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder n = new StringBuilder();
        String result = "";

        for(int i=0;i<words.length;i++){
           StringBuilder sb = new StringBuilder(words[i]);
           n=sb.reverse();
           if(words[i].equals(n.toString())){
            result=words[i];
            return result;
           }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna