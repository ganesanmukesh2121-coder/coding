class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] reverse=new int[nums.length*2];
        int i=0;
        int j=reverse.length-1;
        while(i<nums.length){
            reverse[i]=nums[i];
            reverse[j]=nums[i];
            i++;
            j--;
        }
        return reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna