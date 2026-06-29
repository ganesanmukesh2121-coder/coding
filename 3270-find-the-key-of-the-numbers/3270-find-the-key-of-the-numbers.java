class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String n1 = String.format("%04d",num1);
        String n2 = String.format("%04d",num2);
        String n3 = String.format("%04d",num3);
        String min="";
        for(int i=0;i<4;i++){
            min += (char) Math.min(Math.min(n1.charAt(i), n2.charAt(i)),n3.charAt(i));
        }

         int result = Integer.parseInt(min.toString());

         return result;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna