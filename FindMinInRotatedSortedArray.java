public class FindMinInRotatedSortedArray {
    public class Solution {
        public static int findMin(int []arr) {
            // Write your code here.
            int low = 0, high = arr.length-1, ans = Integer.MAX_VALUE;

            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[low]<=arr[high]){
                    ans = Math.min(ans,arr[low]);
                    break;
                }
                if(arr[low]<=arr[mid]){
                    ans = Math.min(ans,arr[low]);
                    low = mid+1;
                }
                else{
                    ans = Math.min(ans,arr[mid]);
                    high = mid-1;
                }
            }
            return ans;
        }
    }
}
