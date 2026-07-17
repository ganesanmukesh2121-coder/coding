class Solution {
    public int[] evenOddBit(int n) {
        int[] nums = new int[2];
        int even = 0 ;
        int odd = 0 ;
        int index = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n >>= 1;  
            index ++;
        }
        nums[0] = even ;
        nums[1] = odd ;
        return nums ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna