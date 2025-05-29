public class CountGoodNumbers_Recursive {
    class Solution {
        public long power(long x, long p, long ans,long M){
            if(p==0) return ans;
            if(p%2==1){
                ans = (ans*x)%M;
                p = p-1;
            }
            else{
                x = (x*x)%M;
                p = p/2;
            }

            return power(x,p,ans,M);
        }
        public int countGoodNumbers(long n) {
            long even = (n+1)/2;
            long odd = n/2;
            long M = 1000000007;
            long ans = 1;

            return (int)((power(5,even,ans,M)*power(4,odd,ans,M))%M);
        }
    }
}
