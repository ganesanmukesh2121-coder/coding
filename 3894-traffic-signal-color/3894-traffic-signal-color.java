class Solution {
    public String trafficSignal(int timer) {
        return (timer==0)?"Green":(timer==30)?"Orange":(30<timer && timer<=90)?"Red":"Invalid";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna