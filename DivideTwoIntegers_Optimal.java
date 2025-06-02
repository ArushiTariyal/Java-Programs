public class DivideTwoIntegers_Optimal {
    class Solution {// TC = (log base 2 dividend/divisor)^ 2
        public int divide(int dividend, int divisor) {
            if(dividend==divisor) return 1;
            long dividend1 =  Math.abs((long)dividend);
            long divisor1 = Math.abs((long)divisor);
            int sign = 1;
            // ^ ensures that -1 is only when 1^0= 1 or 0^1 = 1
            if((dividend<0 ^ divisor<0)){
                sign = -1;
            }
            long quotient = 0;
            while(dividend1>=divisor1){  //log base 2 dividend/divisor
                long i = 0;
                while(divisor1<<(i+1)<=dividend1){  //log base 2 dividend/divisor
                    i = i+1;
                }
                dividend1 = dividend1 - (1L<<i)*divisor1;
                quotient += (1L<<i);
            }
            if(sign!=-1 && quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int) quotient*sign;
        }
    }
}
