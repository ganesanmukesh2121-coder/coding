class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] num1 = new int[100];
        int j = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0){
             num1[j++] = nums[i];
            }
        }
        for(int i = 0 ; i < j  ; i++){
            boolean flag =true ; 
            for(int k = 0 ; k < j ; k++){
                if(num1[i]==num1[k] && i!=k){
                    flag = false ;
                    break;
                }
            }
            if(flag){
                return num1[i];
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna