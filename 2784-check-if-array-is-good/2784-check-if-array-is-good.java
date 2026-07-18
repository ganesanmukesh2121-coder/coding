class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE ;
        int count = 0 ;
        for(int num : nums){
            if( num > max ) max = num ;
        }
        int[] freq = new int[max+1];
        for(int num : nums){
           freq[num]++ ;
           if(num == max) count++ ;
        }
        for (int i = 1; i < max; i++) {
         if (freq[i] != 1) return false;
        }
     return (!(nums.length != max + 1 || (freq[max] != 2))) ? true : false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna