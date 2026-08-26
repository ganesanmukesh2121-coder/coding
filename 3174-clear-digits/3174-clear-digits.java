class Solution {
    public String clearDigits(String s) {
        char[]arr=new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                if(j>0) j--;
            }
            else{
                arr[j]=ch;
                j++;
            }
        }
        return new String(arr,0,j);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna