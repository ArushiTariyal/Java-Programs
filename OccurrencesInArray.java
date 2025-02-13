public class OccurrencesInArray {
    public class Solution {
        public static int count(int arr[], int n, int x) {
            //Your code goes here
            int first = firstOccurr(arr,n,x);
            if(first==n||first==-1||arr[first]!=x) return 0;
            return lastOccurr(arr,n,x)-first+1;
        }
        public static int firstOccurr(int[] arr, int n, int x){
            int l = 0, h= n-1;
            int first = -1;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(arr[mid]>=x){
                    first = mid;
                    h= mid-1;
                }
                else l = mid+1;
            }
            return first;
        }
        public static int lastOccurr(int[] arr, int n, int x){
            int l=0, h=n-1;
            int last = n;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(arr[mid]>x){
                    last = mid;
                    h =mid-1;
                }
                else l = mid+1;
            }
            return last-1;
        }
    }
}
