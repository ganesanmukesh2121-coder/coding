class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] n = new int[grid.length*grid.length + 1];
        int r = 0 ;
        int sum = 0 ;
        int real = 0 ;
        for(int[] num : grid){
            for(int x : num){
                n[x]++;
            }
        }
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] > 1) r = i ;
            if(n[i] > 0) real += i ;
            sum += i ;
        }
        return new int[]{r , sum - real} ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna