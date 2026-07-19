class Solution {
    public int countAsterisks(String s) {
        String[] sol = s.split("\\|") ;  
        int count = 0 ;
        for(int i = 0 ; i < sol.length ; i++){
            if(i % 2 == 0){
               String n = sol[i] ; 
               for(int j = 0 ; j < n.length() ; j++){
                if(n.charAt(j)=='*') count++;
               }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna