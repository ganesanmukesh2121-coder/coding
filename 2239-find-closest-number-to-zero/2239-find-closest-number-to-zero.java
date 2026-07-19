class Solution {
    public int findClosestNumber(int[] nums) {
        int close = Integer.MAX_VALUE;
        for(int num : nums){
            if(Math.abs(num) < Math.abs(close)) {
               close = num;
            }  
            else if (Math.abs(num) == Math.abs(close) && num > close) {
                close = num; 
            }   
        }
        return close ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna