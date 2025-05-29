public class atoi_recursion1 {
    class Solution {
        public int myAtoiConversion(String s, int i, int sign, long num){
            if(i==0 && (s.charAt(0)=='-'|| s.charAt(0)=='+')){
                sign = findSign(s);
            }
            else if(i==s.length() || !Character.isDigit(s.charAt(i))) return (int)num*sign;

            if(Character.isDigit(s.charAt(i))){
                int dig = s.charAt(i)-'0';
                num = num*10 + dig;
            }
            if(num*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(num*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;


            return myAtoiConversion(s,i+1,sign,num);
        }
        public int findSign(String s){
            return (s.charAt(0)=='-')? -1: 1;
        }
        public int myAtoi(String s) {
            if(s.trim().equals("")) return 0;
            return myAtoiConversion(s.trim(),0,1,0);
        }
    }
}
