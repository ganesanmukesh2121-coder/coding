class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int reverse=0;
        while(n!=0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        return Math.abs(num-reverse);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna