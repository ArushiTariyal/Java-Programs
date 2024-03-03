public class LeftRotateArrayByDPlacesBrute {
    public static void rotateD(int[] a, int d){
        int[] temp = new int[d];
        for(int j = 0; j<=d-1; j++){
            temp[j] = a[j];
        }
        for(int i = d; i<=a.length-1;i++){
            a[i-d] = a[i];
        }
        for(int i = a.length-d; i<=a.length-1; i++){
            a[i] = temp[i-a.length+d];
        }
        for(int e: a) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        rotateD(new int[]{1,2,3,4,5,6,7,8},3);
    }
}
