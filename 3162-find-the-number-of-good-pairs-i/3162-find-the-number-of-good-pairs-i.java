class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int good = 0 ;
        for(int i = 0 ; i < nums1.length  ; i ++ ){
          for(int j = 0 ; j < nums2.length ; j ++){
            if(nums1[i] % (nums2[j] * k) == 0) good ++ ;
          }
        }
        return good ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna