public class FindNthRootOfM2 {
    public class Solution {
        public static int NthRoot(int n, int m) {
            long low = 0, high = m;
            while(low<=high){
                long mid = low+(high-low)/2;
                long comparing =  (long)Math.pow(mid,n);
                if(comparing==m) return (int)mid;
                if(comparing<m) low = mid+1;
                else high = mid-1;
            }
            return -1;
        }

    }

}
