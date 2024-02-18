import java.util.Arrays;

public class SumTriangle2 {
    public static void sumArr(int[] arr, int l){
        if(l==0) return;
        int[] adds = new int[l-1];
        for(int i = 0; i<l-1; i++){
            adds[i] = arr[i]+arr[i+1];
        }
        sumArr(adds,adds.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumArr(arr,arr.length);
    }
}
