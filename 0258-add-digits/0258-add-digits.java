class Solution {
    public int addDigits(int num) {
        if(num>9){
        while(num>9){
            int digit = 0;
            while(num>0){
               digit += num%10;
               num/=10;
            }
            num = digit;
        }
        return num;
        }
        return num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna