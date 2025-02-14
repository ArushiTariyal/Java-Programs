import java.io.*;
import java.util.*;
public class FindKthRotationInRotatedSortedArray {

    class Solution {
        public int findKRotation(List<Integer> arr) {
            // Finding min and taking track of the index
            int low = 0, high = arr.size()-1, ans = Integer.MAX_VALUE, ind = 0;
            while(low<=high){
                int mid = low + (high-low)/2;

                if(arr.get(low)<=arr.get(high)){
                    if(ans>arr.get(low)){
                        ind = low;
                        break;
                    }
                }

                if(arr.get(low)<=arr.get(mid)){
                    if(ans>arr.get(low)){
                        ans = arr.get(low);
                        ind = low;
                    }
                    low = mid+1;
                }
                else{
                    if(ans>arr.get(mid)){
                        ans = arr.get(mid);
                        ind = mid;
                    }
                    high = mid-1;
                }
            }
            return ind;
        }
    }
}
