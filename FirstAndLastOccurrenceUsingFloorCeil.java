import java.util.ArrayList;
public class FirstAndLastOccurrenceUsingFloorCeil {
    public class Solution {

        public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
            // Write your code here.
            return firstpos(arr,n,k);
        }
        public static int lastpos(ArrayList<Integer> arr, int n, int k){
            int l = 0, h = n-1;
            int last = n;
            while(l<=h){
                int mid = l + (h-l)/2;
                if(arr.get(mid)<=k){
                    last = mid;
                    l = mid+1;
                }
                else h = mid-1;
            }
            return last;

        }
        public static int[] firstpos(ArrayList<Integer> arr, int n, int k){
            int l = 0, h = n-1;
            int first = -1;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(arr.get(mid)>=k){
                    first = mid;
                    h = mid-1;
                }
                else l = mid+1;
            }
            if(first==-1||first==n||arr.get(first)!=k){
                return new int[] {-1,-1};
            }

            return new int[]{first,lastpos(arr,n,k)};
        }

    }

}
