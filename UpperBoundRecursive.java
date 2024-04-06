public class UpperBoundRecursive {
    public class Solution {
        public static int upperBound(int []arr, int x, int n){
            return binarySearch(arr,x,0,n-1,n);
        }
        public static int binarySearch(int[] arr, int x, int low, int high,int ans){
            if(low>high) return ans;
            int mid = low + (high-low)/2;
            if(arr[mid]>x) return binarySearch(arr,x,low,mid-1,mid);
            return binarySearch(arr,x,mid+1,high,ans);
        }
    }

}
