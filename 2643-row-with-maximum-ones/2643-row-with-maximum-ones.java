class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int index = 0;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < mat.length ; i++ ){
            count = 0 ;
            for( int j = 0 ; j < mat[i].length ; j++ ){
               count += mat[i][j] ;
            }
            if(count > max){
             max = count ;
             index = i ;
            }
        }
        return new int[]{index, max};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna