import java.util.Arrays;

class Solution {
    public int minimumOperations(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int fq[]= new int[max+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                fq[nums[i]]++;
            }
        }
        int count=0;
        for(int i=0;i<fq.length;i++){
            if(fq[i]>0){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna