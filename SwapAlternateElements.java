public class SwapAlternateElements {
    public static void main(String[] args){

        swapAlternate(new int[] {1,2,3,4,5,6});
        swapAlternate(new int[] {7,8,9,10});
    }
    public static void swapAlternate(int[] arr){
        int i=0;
        int j = i+1 ;
        while(i<arr.length-1){
            arr[i] += arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] -= arr[j];
            i += 2;
            j += 2;
        }
        for(int e: arr) System.out.print(e+" ");
        System.out.println();
    }
}
