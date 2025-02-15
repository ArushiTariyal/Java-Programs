public class FindNthRootUsingBinarySearch2 {
    public class Solution {
        public static int calc(int n, int m, int mid){
            long ans = 1;
            for(int i = 1; i<=n; i++){
                ans = ans * mid;
                if(ans>m) return 2;
            }
            if(ans==m) return 1;
            return 0;
        }
        public static int NthRoot(int n, int m) {
            // Write your code here.
            int low = 1, high = m;
            while(low<=high){
                int mid = low + (high-low)/2;
                int ans = calc(n,m,mid);
                if(ans==1) return mid;
                else if(ans == 0) low = mid+1;
                else high = mid-1;
            }
            return -1;

        }
    }

}
