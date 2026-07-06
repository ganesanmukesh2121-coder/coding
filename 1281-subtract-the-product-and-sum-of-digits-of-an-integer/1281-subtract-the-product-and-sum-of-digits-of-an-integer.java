class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        while(n>0){
            int d = n%10;
            sum+=d;
            pro*=d;
            n/=10;
        }
        return pro-sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna