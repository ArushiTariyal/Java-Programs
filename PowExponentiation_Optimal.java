public class PowExponentiation_Optimal {
    class Solution {
        public double myPow(double x, int n) {
            long pow = Math.abs((long) n);
            // if(n<0){
            //     pow = -1*n;
            // }

            double ans = 1;
            while(pow>0){
                if(pow%2 ==0){
                    x = x*x;
                    pow /=2;
                }
                else{
                    ans  = ans*x;
                    pow--;
                }
            }
            if(n<0) return 1.0/ans;
            return ans;
        }
    }
}
