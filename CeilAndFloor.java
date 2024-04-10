public class CeilAndFloor {

    public class Solution {
        public static int[] getFloorAndCeil(int[] a, int n, int x) {
            int low = 0, high = n-1;
            int ans = -1;
            while(low<=high){
                int mid = low +(high-low)/2;
                if(a[mid]<=x){
                    ans = a[mid];
                    low = mid+1;
                }
                else high = mid-1;
            }
            int floor = ans;
            ans = -1;
            low = 0; high = n-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(a[mid]>=x){
                    ans = a[mid];
                    high = mid-1;
                }
                else low = mid+1;
            }
            int ceil = ans;
            return new int[]{floor,ceil};
        }

    }
}
