public class FindSquareRootUsingBinarySearch {
    class Solution {
        int floorSqrt(int n) {
            // Your code here
            int low = 1, high = n;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(mid*mid<=n)low = mid+1;
                else high = mid-1;
            }
            return high;
        }
    }
}
