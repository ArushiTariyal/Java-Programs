public class SumDigArray {
    public static int sumDig(int[] arr, int l, int i){
        if(i==l-1) return arr[i];
        return arr[i] + sumDig(arr, l, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(sumDig(arr, arr.length, 0));
    }
}
