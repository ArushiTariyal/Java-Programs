public class FloorAndCeilingIterative {
    public class Solution {
        public static int[] getFloorAndCeil(int[] a, int n, int x) {
            int low = 0, high = n-1;
            return new int[]{getFloor(a,x,low,high,-1), getCeil(a,x,low,high,-1)};
        }
        public static int getFloor(int[] a, int x, int low, int high, int ans){
            while(low<=high){
                int mid = low + (high-low)/2;
                if(a[mid]<=x){
                    ans = a[mid];
                    low = mid+1;
                }
                else high = mid-1;
            }
            return ans;
        }
        public static int getCeil(int[] a, int x, int low, int high, int ans){
            while(low<=high){
                int mid = low + (high-low)/2;
                if(a[mid]>=x){
                    ans = a[mid];
                    high = mid-1;
                }
                else low = mid+1;
            }
            return ans;
        }
    }
}
