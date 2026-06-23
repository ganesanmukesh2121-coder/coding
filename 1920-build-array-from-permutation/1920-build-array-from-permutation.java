class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           arr[i]=nums[nums[i]];
        }
        return arr; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna