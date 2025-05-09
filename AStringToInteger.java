public class AStringToInteger {
    class Solution {
        public int myAtoi(String s) {
            s = s.trim();
            if(s.length()==0) return 0;
            long num = 0;
            int sign = 1;
            int i = 0;
            if(s.charAt(0)=='-' || s.charAt(i)=='+'){
                sign = (s.charAt(0)=='-')? -1 : 1;
                i++;
            }

            while(i<s.length() && Character.isDigit(s.charAt(i))){
                int dig = s.charAt(i)-'0';
                num = num*10 + dig;
                if(num*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(num*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                i++;
            }

            return (int)num * sign;
        }
    }



}
