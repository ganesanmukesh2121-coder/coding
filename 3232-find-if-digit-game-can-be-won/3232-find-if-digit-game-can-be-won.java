class Solution {
    public boolean canAliceWin(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]>0 && nums[i]<10)
                sum1+=nums[i];
            else
                sum2+=nums[i];
        }
        return (sum1<sum2 || sum1>sum2)?true:false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna