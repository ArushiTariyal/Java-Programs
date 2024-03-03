public class MoveZerosToEnd {
    public static void moveZeros(int[] a){
        int j =0;
        for(int i = 0; i<=a.length-1; i++){
            if(a[i]!=0){
                if(i!=j){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for(int e: a) System.out.print(e+" ");
    }

    public static void main(String[] args) {
        int[] a = {1,3,0,6,4,0,0,4,57,9,0,6,4,7,0};
        moveZeros(a);
    }
}
