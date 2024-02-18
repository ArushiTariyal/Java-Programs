import java.util.Arrays;

public class RecurBinSearch {
    public static int binSearch(int s, int e, int[] arr, int key){
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid] < key) return binSearch(mid+1, e, arr,key);
        return binSearch(s,mid-1,arr,key);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,9,8,2,0,7,1};
        Arrays.sort(arr);
        System.out.println(binSearch(0,arr.length-1,arr,9));
    }
}
