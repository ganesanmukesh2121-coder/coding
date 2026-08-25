class Solution {
    public boolean halvesAreAlike(String s) {
        String[] c = s.split("") ;
        String v = "aeiouAEIOU" ;
        int count1 = 0 ;
        int count2 = 0 ;
        for(int i = 0 , j = s.length() / 2 ; i < s.length() / 2 && j < c.length ; i++ , j++){
            if(v.indexOf(c[i]) != -1) count1++ ;
            if(v.indexOf(c[j]) != -1) count2++ ;
        }
        return count1 == count2 ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna