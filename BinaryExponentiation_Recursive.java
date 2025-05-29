public class BinaryExponentiation_Recursive {
    class Solution {
        public double myPowCal(double x, long n, int sign){
            if(n==0) return 1.0;
            double half = myPowCal(x,n/2,sign);
            double result = half*half;
            if(n%2==1) result = result*x;
            return result;
        }
        public double myPow(double x, int n) {
            int sign = 1;
            long num = n;
            if(n<0) {
                x = 1/x;
                sign = -1;
                num = num*-1;
            }
            return myPowCal(x,num,sign);
        }
    }
}
