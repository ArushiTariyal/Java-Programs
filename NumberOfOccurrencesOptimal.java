public class NumberOfOccurrencesOptimal {
    public class Solution {
        public static int count(int arr[], int n, int x) {
            int first = firstOccurrence(arr,n,x);
            if(first == n || arr[first] != x) return 0;
            return lastOccurrence(arr,n,x)-first+1;
        }
        public static int firstOccurrence(int[] arr, int n, int x){
            int low = 0, high = n-1;
            int first  = n;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]>=x){
                    first = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }
            return first;
        }
        public static int lastOccurrence(int[] arr, int n, int x){
            int low = 0, high = n-1;
            int last  = n;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]<=x){
                    last = mid;
                    low = mid+1;
                }
                else high = mid-1;
            }
            return last;
        }
    }
}
