import java.util.Arrays;

public class RecursiveSortingDescending {
    public static void descendingSort(int[] arr,int l){
        if(l==1) return;
        int key = arr[l-1];
        descendingSort(arr,l-1);
        insert(arr,l-1,key);
    }
    public static void insert(int[] arr, int m, int key){
        if(m==0 || arr[m-1]>=key){
            arr[m] = key;
            return;
        }
        int val = arr[m-1];
        insert(arr, m-1,key);
        arr[m] = val;
    }
    public static void main(String[] args) {
        int[] arr = {6,9,5,2,8,3,4};
        descendingSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
