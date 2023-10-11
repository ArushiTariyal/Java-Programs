public class TotalOccurrence {
    public static void main(String[] args) {
        System.out.println(Occurrence(new int[]{1, 2, 3, 3, 3, 3, 4, 6}, 3));
        System.out.println(Occurrence(new int[]{1, 2, 3, 4, 6}, 4));
    }

    public static int Occurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1, mid;
        int firstIndex = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < key) start = mid + 1;
            else if (arr[mid] > key) end = mid - 1;
            else {
                firstIndex = mid;
                end = mid - 1;
            }
        }
        start = 0;
        end = arr.length - 1;
        int lastIndex = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < key) start = mid + 1;
            else if (arr[mid] > key) end = mid - 1;
            else {
                lastIndex = mid;
                start = mid + 1;
            }
        }
        return lastIndex-firstIndex+1;
    }
}

