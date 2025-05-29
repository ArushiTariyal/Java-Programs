public class CountGoodNumbers_Iterative {
    class Solution {
        public long power(long x, long pow){
            long M = 1000000007;
            long p = pow;
            long ans = 1;
            while(p>0){
                if(p%2==1){
                    ans = (ans*x)%M;
                    p = p-1;
                }
                else{
                    x = (x*x)%M;
                    p = p/2;
                }
            }
            return ans;
        }
        public int countGoodNumbers(long n) {
            long even = (n+1)/2;
            long odd = n/2;
            long M = 1000000007;
            return (int)((power(5,even)*power(4,odd))%M);
        }
    }
}
