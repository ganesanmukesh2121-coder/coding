class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return max2+max1-min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna