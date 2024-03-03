public class LinearSearchIterative {
    public static void linearSearch(int[] a, int val){
        int i;
        for(i = 0; i<= a.length-1; i++){
            if(a[i]==val){
                System.out.println(i);
                break;
            }
        }
        if(i==a.length) System.out.println(-1);
    }
    public static void main(String[] args) {
        int[] a = {4, 5, 3, 4, 3, 7, 9, 0};
        linearSearch(a,3);
        linearSearch(a,8);
    }

}
