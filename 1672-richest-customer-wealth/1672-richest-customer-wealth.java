class Solution {
    public int maximumWealth(int[][] accounts) {
        int d = accounts.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<d;i++){
            sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
           if(sum>=max){
            max = sum;
           }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna