public class SecondLargestElementOptimal {
    public static int secondLargest(int[] a,int i, int secLargest, int largest){
        if(i>=a.length) {
            System.out.println("Largest: "+ largest);
            System.out.print("Second Largest: ");
            return secLargest;
        }
        if(a[i]>largest) {
            largest = a[i];
        }
        else if(a[i]>secLargest && a[i]!=largest){
            secLargest = a[i];
        }
        return secondLargest(a,i+1, secLargest,largest);

    }
    public static void main(String[] args) {
        int[] a = {3,6,3,6,7,2,7,4,37,8,0,5};
        System.out.println(secondLargest(a,0,-1,-1));
    }
}
