public class SecondSmallestElementOptimal {
    public static void secondSmallest(int[] a){
        int smallest = a[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i = 1; i<=a.length-1; i++){
            if(a[i]<smallest){
                secSmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] != smallest && a[i]<secSmallest) secSmallest = a[i];
        }
        System.out.println("Smallest: "+smallest);
        System.out.println("Second Smallest: "+secSmallest);
    }
    public static void main(String[] args) {
        int[] a = {4,6,2,5,7,8,9,0};
        secondSmallest(a);
    }
}
