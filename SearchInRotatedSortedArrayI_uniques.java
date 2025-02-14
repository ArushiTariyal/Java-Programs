import java.util.ArrayList;
public class SearchInRotatedSortedArrayI_uniques {
    public class Solution {
        public static int search(ArrayList<Integer> arr, int n, int k) {
            // Write your code here.
            int l = 0, h = n-1;
            while(l<=h){
                int mid = l +(h-l)/2;

                if(arr.get(mid) == k){
                    return mid;
                }

                else if(arr.get(l)<arr.get(mid)){
                    if(arr.get(l)<=k && k<arr.get(mid)){
                        h = mid-1;
                    }
                    else l = mid+1;
                }
                else{
                    if(arr.get(mid)<k && k<=arr.get(h)){
                        l= mid+1;
                    }
                    else h = mid-1;
                }
            }
            return -1;
        }
    }
}
