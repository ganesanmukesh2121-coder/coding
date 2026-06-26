class Solution {
    public int findClosest(int x, int y, int z) {
        int person1=Math.abs(z-x);
        int person2=Math.abs(z-y);
        if(person1<person2){
            return 1;
        }
        else if(person1>person2){
            return 2;
        }
        else{
            return 0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna