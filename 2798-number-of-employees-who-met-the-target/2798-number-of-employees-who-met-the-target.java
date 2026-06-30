class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int num:hours){
            if(num>=target){
              count++;
            }   
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna