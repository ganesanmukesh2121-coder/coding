class Solution {
    public int lengthOfLastWord(String s) {
        String[] n=s.split("\\s+");
        int count=0;
        String last=n[n.length-1];
        for(int i=0;i<last.length();i++){
            count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna