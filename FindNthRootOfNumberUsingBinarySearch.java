public class FindNthRootOfNumberUsingBinarySearch {
    class Solution {
        public int nthRoot(int n, int m) {
            // code here
            int low = 1, high = m;
            while(low<=high){
                int mid = low + (high-low)/2;
                int val = (int)Math.pow(mid,n);
                if(val==m) return mid;
                else if(val<m) low = mid+1;
                else high = mid-1;
            }
            return -1;
        }
    }
}
