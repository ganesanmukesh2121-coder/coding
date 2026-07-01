class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            String s1 = s.charAt(i)+"";
            String s2 = s.charAt(i+1)+"";
          if(!(s1.equalsIgnoreCase(s2))){
            count++;
          }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna