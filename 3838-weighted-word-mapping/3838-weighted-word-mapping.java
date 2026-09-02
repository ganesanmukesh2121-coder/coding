class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb =  new StringBuilder();
        int i, j,  n = words.length,wordlen, sum = 0;

        for(i=0;i<n;i++)
        {
            wordlen = words[i].length();
            sum = 0;
            for(j=0;j<wordlen;j++)
                sum += weights[words[i].charAt(j) - 97];
            sum %= 26;
            sb.append((char)(122 - sum));
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna