class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0;i < sentences.length; i++){
           int len = 0;
           String[] arr=sentences[i].split(" ");
           len = arr.length;
           if(len>max){
            max=len;
           }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna