import java.util.ArrayList;
public class AllocateBooks_Optimal2 {

    public class Solution {
        public static int findPages(ArrayList<Integer> arr, int n, int m) {
            // Write your code here.
            if(m>n) return -1;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i<arr.size(); i++){
                max = Math.max(max, arr.get(i));
                sum += arr.get(i);
            }
            int low = max, high = sum;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(studentCount(arr,m,n,mid)) high = mid-1;
                else low = mid+1;
            }
            return low;
        }
        public static boolean studentCount(ArrayList<Integer> arr, int students, int books, int pages){
            int stuCount= 1, allocated = 0;
            for(int i = 0; i<arr.size(); i++){
                if(arr.get(i)+allocated<=pages){
                    allocated += arr.get(i);
                }
                else{
                    stuCount++;
                    allocated = arr.get(i);
                }
            }
            if(stuCount<=students) return true;
            return false;
        }
    }
}
