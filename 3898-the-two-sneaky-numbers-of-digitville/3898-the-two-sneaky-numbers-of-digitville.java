class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int max = Integer.MIN_VALUE ;
        for(int num : nums ){
            if(num > max) max = num ;
        }
        int[] fre = new int[max + 1];
        int arr[] = new int[2] ;
        int k = 0 ;
        for(int num : nums){
            fre[num]++;
        }
        for(int i = 0 ; i < fre.length ; i++){
            if(fre[i] == 2) {
                arr[k++] = i ;
            }
        }
        return arr ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna