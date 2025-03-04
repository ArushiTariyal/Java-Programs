public class RotateString_Optimal {
    class Solution {
        public boolean rotateString(String s, String goal) {
            return (s.length()==goal.length() && (s+s).contains(goal));
        }
    }
}
