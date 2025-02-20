public class RowWithMaximumNumberOf1s_BinarySearchIn2D {
    class Solution {
        public int rowWithMax1s(int arr[][]) {
            // code
            int ind = -1, count = -1;
            int n = arr.length, m = arr[0].length;
            for(int row = 0; row<n; row++){
                int value = m- findMax(arr[row],m,1);
                if(value>count){
                    count = value;
                    ind = row;
                }
            }
            return ind;
        }
        public int findMax(int[] temp,int size, int target){
            int low = 0, high = size-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(temp[mid]>=target){
                    high = mid-1;
                }
                else low = mid+1;
            }
            return low;
        }
    }
}
