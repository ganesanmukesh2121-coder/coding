class Solution {
    public int heightChecker(int[] heights) {
        int[] expect = new int[heights.length];
        for(int i=0;i<expect.length;i++){
            expect[i]=heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(expect[i]!=heights[i]) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna