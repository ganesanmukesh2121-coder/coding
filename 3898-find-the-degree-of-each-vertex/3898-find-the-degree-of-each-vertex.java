class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr = new int[matrix.length] ;
        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix[i].length ; j++) {
                arr[i] += matrix[j][i] ;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna