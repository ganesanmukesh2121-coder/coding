class Solution {
    public boolean checkDivisibility(int n) {
        int add=0;
        int mul=1;
        int original=n;
        while(n>0){
            int temp=n%10;
            add+=temp;
            mul*=temp;
            n/=10;
        }
        return(original%(mul+add)==0)?true:false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna