import java.util.Arrays;
public class RecursiveSorting2 {
    public static void sort(int[] arr, int l){
        if(l==1) return;
        sort(arr,l-1);
        insert(arr, l-1, arr[l-1]);
    }
    public static void insert(int[] arr, int k, int n){
        if(k==0){
            arr[0] = n;
            return;
        }
        if(arr[k-1]<n){
            arr[k] = n;
            return;
        }
        int val = arr[k-1];
        insert(arr,k-1,n);
        arr[k] = val;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,5,2,8,3,4};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

