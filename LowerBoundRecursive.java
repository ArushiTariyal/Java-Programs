public class LowerBoundRecursive {
    public class Solution {
        public static int lowerBound(int []arr, int n, int x) {
            return binarySearch(arr,x,0,n-1,n);
        }
        public static int binarySearch(int[] arr, int x, int low, int high,int idx){
            if(low>high) return idx;
            int mid = low +(high-low)/2;
            if(arr[mid]<x) {
                low = mid+1;
                return  binarySearch(arr,x,low,high,idx);
            }

            high = mid-1;
            idx = mid;
            return binarySearch(arr,x,low,high,idx);

        }
    }
}
