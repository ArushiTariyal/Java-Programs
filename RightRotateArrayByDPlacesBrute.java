public class RightRotateArrayByDPlacesBrute {
    public static void rotate(int[] a, int d){
        int[] temp = new int[a.length-d];
        for(int i = a.length-d; i<=a.length-1; i++){
            temp[i-(a.length-d)] = a[i];
        }
        for(int i = a.length-1-d; i>=0; i--){
            a[i+d] = a[i];
        }
        for(int i = 0; i<d; i++){
            a[i] = temp[i];
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);
    }
}
