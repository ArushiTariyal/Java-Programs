public class RearrangeArrayElementsBySignBrute {
    public static void rearrange(int[] arr){
        int n = arr.length/2;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int p=0,ne=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=0) positive[p++] = arr[i];
            else negative[ne++] = arr[i];
        }
        ne=0;p=0;
        for(int i = 0; i<arr.length; i++){
            if(i%2==0) arr[i] = positive[p++];
            else arr[i] = negative[ne++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        rearrange(arr);
        for(int e: arr) System.out.print(e+" ");
    }
}
