class Solution {
    public int minOperations(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length-1 ; i++){
            if(nums[i] < nums[i+1]){
               continue;
            }
            else{
                 while(nums[i+1]<=nums[i]){
                    nums[i+1]++;
                    count++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna