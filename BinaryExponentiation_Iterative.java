public class BinaryExponentiation_Iterative {
    class Solution {
        public double myPow(double x, int n) {
            double ans = 1.0;
            long nn = n;
            if(nn<0){
                x = 1/x;
                nn = -1*nn;
            }

            while(nn>0){
                if(nn%2==0){
                    x = x*x;
                    nn /=2;
                }
                else{
                    ans *=x;
                    nn = nn-1;
                }
            }
            return ans;

        }
    }
}
