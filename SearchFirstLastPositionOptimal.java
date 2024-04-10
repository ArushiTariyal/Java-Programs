public class SearchFirstLastPositionOptimal {
    public static void search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        int start  = low;
        low = 0; high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        int end = high;
    }
}
