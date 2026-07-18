class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max) max = num ; 
            if(num < min) min = num ;
        }
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == max || nums[i] == min) nums[i] = 0 ;
        }
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] != 0) return nums[i];
        }
    return -1 ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna