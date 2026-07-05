class Solution {
    public int differenceOfSum(int[] nums) {
        int i = 0;
        int sum = 0;
        int digit = 0;
        while(i<nums.length){
            if(nums[i]>9){
                int n = nums[i];
                while(n>0){
                    digit += n%10;
                    n/=10;
                }
            }
            else{
                digit += nums[i];
            }
            sum += nums[i];
            i++;
        }
        return Math.abs(sum-digit);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna