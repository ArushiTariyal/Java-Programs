public class RoseGarden {
    public class Solution {
        public static int roseGarden(int[] arr, int r, int b) {
            // Write your code here.
            int n = arr.length;
            if(r*b>n) return -1;
            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]<low) low = arr[i];
                else if(arr[i]>high) high = arr[i];
            }
            while(low<=high){
                int mid = low+(high-low)/2;
                if(findBouquets(arr,r,b,mid)>=b) high = mid-1;
                else low = mid+1;
            }
            return low;

        }
        public static int findBouquets(int[] arr, int r, int b, int day){
            int bouquets = 0, cnt = 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]<=day) cnt++;
                else{
                    bouquets += cnt/r;
                    cnt = 0;
                }
            }
            bouquets += cnt/r;
            return bouquets;
        }
    }
}
