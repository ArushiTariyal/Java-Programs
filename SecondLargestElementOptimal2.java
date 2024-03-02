public class SecondLargestElementOptimal2 {
    public static void secondLargest(int[] a){
        int largest = a[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i = 1; i<=a.length-1; i++){
            if(a[i]>largest){
                secLargest = largest;
                largest = a[i];
            }
            else if(a[i]>secLargest && a[i]!=largest){
                secLargest = a[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+ secLargest);
    }
    public static void main(String[] args) {
        int[] a = {4,6,2,5,7,8,9,0};
        secondLargest(a);
    }
}
