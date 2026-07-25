class Solution {
    public int maxProduct(int n) {
        
        int[] arr = new int[10];
        int k = 0 ;
        int length = 0 ;
        int pro = 0 ;
        int max = 0 ;
        while(n > 0){
            arr[k] = n % 10;
            n /= 10 ;
            length++;
            k++;
        }
        for(int i = 0 ; i < length ; i++){
            for(int j = i+1 ; j < length ; j++){
                pro = arr[i] * arr[j];
                if(pro > max){
                    max = pro ;
                }
            }
        }
        return max ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna