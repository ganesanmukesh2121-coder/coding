class Solution {
    public int firstUniqChar(String s) {
        char[] find = s.toCharArray();
        
        for(int i=0;i<find.length;i++){
            boolean flag = true;
            for(int j=0;j<find.length;j++){
                if(find[i]==find[j] && i!=j){
                   flag = false;
                   break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna