class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bit = 0;
        for(int num:nums){
            if(num%2==0){
                bit |= num;
            }
        }
        return (bit==0)?0:bit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna