class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for(int n : nums){
           total+=n;
        }

        int l =0;
        int ans =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
            int r = total - l;
            if(l == r ) ans+=2;
            else if(Math.abs(l - r ) == 1)
            ans++;
            }
            l+= nums[i];

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna