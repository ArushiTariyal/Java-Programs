import java.util.Arrays;

public class RecursiveSorting {

    public static void sort(int[] arr, int l){
        if(l==1) return;
        sort(arr,l-1);
        insert(arr, l-1, arr[l-1]);
    }
    public static void insert(int[] arr, int k, int n){
        if(k==0 || arr[k-1]<n) return;
        swap(arr,k-1,n);
        insert(arr,k-1,n);
    }
    public static void swap(int[] arr, int index, int n){
        int c = arr[index];
        arr[index] = n;
        arr[index+1] = c;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,5,2,8,3,4};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
