class Solution {
    public int countPartitions(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int sum1=0;
        int sum2=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            arr1[i]=nums[i];
            sum1+=arr1[i];
          for(int j=i;j<nums.length-1;j++){
            arr2[j]=nums[j+1];
            sum2+=arr2[j];
          } 
          if((sum1+sum2)%2==0){
            count++;
          }
          sum2=0;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna