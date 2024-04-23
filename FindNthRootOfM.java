public class FindNthRootOfM {
    public class Solution {
        public static int NthRoot(int n, int m) {
            long low = 0, high = m;
            while(low<=high){
                long mid = low+(high-low)/2;
                long comparing = findingPower(mid,n,m);
                if(comparing==m) return (int)mid;
                if(comparing<m) low = mid+1;
                else high = mid-1;
            }
            return -1;
        }
        public static long findingPower(long base, int power, int target){
            long ans = 1;
            for(int i = 1; i<=power; i++){
                ans *= base;
                if(ans>target) break;
            }
            return ans;
        }
    }

}
