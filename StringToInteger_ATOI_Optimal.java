public class StringToInteger_ATOI_Optimal {
    class Solution {
        public int myAtoi(String s) {
            s = s.trim();
            if(s.length()==0) return 0;

            int sign = 1;
            if(s.charAt(0)=='-'){
                sign = -1;
                s = s.substring(1);
            }
            else if(s.charAt(0)=='+') s = s.substring(1);

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            long ans = 0;
            for(int i = 0; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    ans = ans*10;
                    ans += s.charAt(i) -'0';

                    if(sign==-1 && ans*sign<min) return min;
                    else if(sign ==1 && ans*sign>max) return max;
                }
                else{
                    break;
                }
            }
            return (int)ans*sign;

        }
    }
}
