import java.util.ArrayList;
public class FirstAndLastOccurrenceUsingSimpleBS {

    public class Solution {

        public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
            // Write your code here.
            int first = binarySearchF(arr,n,k);
            if(first == -1) return new int[]{-1,-1};
            return new int[]{first, binarySearchL(arr,n,k)};

        }
        public static int binarySearchF(ArrayList<Integer> arr, int n, int k){
            int l = 0, h = n-1;
            int first = -1;
            while(l<=h){
                int mid = l+ (h-l)/2;
                if(arr.get(mid)==k){
                    first = mid;
                    h = mid-1;
                }
                else if(arr.get(mid)>k){
                    h = mid-1;
                }
                else l = mid+1;
            }
            if(first ==-1 || first==n || arr.get(first) != k) return -1;
            return first;
        }
        public static int binarySearchL(ArrayList<Integer> arr, int n, int k){
            int l = 0, h = n-1;
            int last =n;
            while(l<=h){
                int mid = l + (h-l)/2;
                if(arr.get(mid)==k){
                    last = mid;
                    l = mid+1;
                }
                else if(arr.get(mid)>k){
                    h = mid-1;
                }
                else l = mid+1;
            }
            return last;
        }

    };

}
