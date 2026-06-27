class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int sum = i; 
            boolean flag = true;
            for(int num:nums){
                sum+=num;
                if(sum<1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna