class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        int large = 0 ;
        for(int num : arr){
            freq[num]++;
        }
        for(int i = 1 ; i < freq.length  ; i++){
            if(freq[i] == i){
             large = i ;
            }
        }
        return (large>0) ? large : -1 ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna