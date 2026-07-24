class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = 0 ;
        int out = 0 ;
        int[] freq = new int[arr[arr.length-1]+1];
        for( int num : arr ){
            freq[num]++;
        }
        for( int i = 0 ; i < freq.length ; i++ ){
            if(freq[i] > max){
                max = freq[i] ;
                out = i ;
            }
        }
        return out ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna