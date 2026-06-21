class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
               count++;
            }
         }
         return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna