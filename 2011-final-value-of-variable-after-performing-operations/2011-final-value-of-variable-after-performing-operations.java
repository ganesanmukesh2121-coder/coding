class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String num:operations){
            if(num.equals("++X")) ++X;
            else if(num.equals("X++")) X++;
            else if(num.equals("--X")) --X;
            else X--;
        }
        return X;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna