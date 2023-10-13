public class PeakIndexInMountainArray {
     static class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0, end = arr.length - 1, mid;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] < arr[mid + 1]) start = mid + 1;
                else if (arr[mid] < arr[mid - 1]) end = mid - 1;
                else return mid;
            }
            return -1;
        }
        public static void main(String[] args){
           Solution sol = new Solution();
            System.out.println(sol.peakIndexInMountainArray(new int[] {1,2,3,4,5,2,0}));
            System.out.println(sol.peakIndexInMountainArray(new int[] {2,8,5}));
            System.out.println(sol.peakIndexInMountainArray(new int[] {1,5,4,3}));
        }

    }
}
