public class LargestOddNumberInAString_Optimal {
    class Solution {
        public String largestOddNumber(String num) {
            String ans = "";
            int i = 0;
            for(i = num.length()-1; i>=0; i--){
                int n = num.charAt(i)+0;
                if(n%2!=0){
                    break;
                }
            }
            if(i==-1) return "";
            return num.substring(0,i+1);
        }
    }
}
