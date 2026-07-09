class Solution {
    public int minMoves(int[] nums) {
        int max = 0 ;
        int count = 0 ;
        int i = 0 ;
        for(int num : nums){
            if(num  > max){
                max = num ; 
            }
        }
        for(int num : nums){
            count += max - num ;
        }
        return count ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna