class Solution {
    public int balancedStringSplit(String s) {
        int ans=0,R=0,L=0,i=0;

        while(i<s.length()){
            if(s.charAt(i)=='R')R++;
            else L++;
            if(L==R){
                L=0;
                R=0;
                ans++;
            }

            i++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna