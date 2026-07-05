class Solution {
    public String triangleType(int[] nums) {

        if ((nums[0] + nums[1]) <= nums[2] ||
            (nums[0] + nums[2]) <= nums[1] ||
            (nums[1] + nums[2]) <= nums[0]) {
            return "none";
        }
        if(nums[0]==nums[1] && nums[0]==nums[2] && nums[1]==nums[2]){
            return "equilateral";
        }
        if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
            return "isosceles";
        }
            
        return "scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna