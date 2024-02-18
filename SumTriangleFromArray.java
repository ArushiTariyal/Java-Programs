import java.util.Arrays;

public class SumTriangleFromArray {
    public static int[] sumElem(int[] arr,int l, int i){
        if(l==1){
            return arr;
        }
        if(i != l-1) {
            arr[i] = arr[i] + arr[i + 1];
            return sumElem(arr, l, i + 1);
        }
        for(int j = 0; j<l-1; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        return sumElem(arr,l-1,0);
    }

    public static int[] sumElem2(int[] arr,int[] sumarr,int l, int i){
        if(l==1){
            return arr;
        }
        if(i != l-1) {
            sumarr[i] = arr[i] + arr[i + 1];
            return sumElem2(arr,sumarr, l, i + 1);
        }
        System.out.println(Arrays.toString(sumarr));
        return sumElem2(sumarr,new int[l-2],l-1,0);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int size = arr2.length;
        int[] sumarr = new int[size-1];
        sumElem(arr,arr.length,0);
        System.out.println();
        sumElem2(arr2,sumarr,arr2.length,0);

    }
}
