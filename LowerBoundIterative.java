public class LowerBoundIterative {
    public class Solution {
        public static int lowerBound(int []arr, int n, int x) {
            int idx = n;
            int low = 0, high = n-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]<x) low = mid+1;
                else{
                    idx = mid;
                    high = mid-1;
                }
            }
            return idx;
        }
    }
}
