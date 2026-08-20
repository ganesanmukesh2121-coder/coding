class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int n1 = nums[i] % 2 ;
            int n2 = nums[i+1] % 2 ;
            if(n1 == n2){
                return false ;
            }
        }
        return true ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna