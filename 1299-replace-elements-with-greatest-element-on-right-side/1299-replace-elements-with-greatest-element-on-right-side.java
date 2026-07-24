class Solution {
    public int[] replaceElements(int[] arr) {
        int[] num = new int[arr.length];

        for( int i = 0 ; i < num.length ; i++ ){
            int max = 0 ;
            for( int j = i + 1 ; j < num.length ; j++){
               if(arr[j] > max){
                 max = arr[j] ;
               }
            }
            if(max > 0){
                num[i] = max ;
            }
            else{
                num[i] = -1 ;
            }
        }
        return num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna