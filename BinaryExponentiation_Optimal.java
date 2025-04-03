public class BinaryExponentiation_Optimal {
    class Solution {
        public double myPow(double x, int n) {
            long m = n;
            if(m<0) m = -m;
            double ans = 1;
            while(m!=0){
                if(m%2==0){
                    m = m/2;
                    x = x*x;
                }
                else{
                    ans *= x;
                    m = m-1;
                }
            }
            if(n<0) return 1/ans;
            return ans;
        }
    }
}
