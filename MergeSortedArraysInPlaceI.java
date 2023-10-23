public class MergeSortedArraysInPlaceI {
    public static int[] mergeSortedArrays(int[] a, int[] b){
        int i = 0;
        int j = 0;
        int l1 = a.length;
        int l2 = b.length;
        while(j<l2 && i<l1-l2){
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                j++;
            }
            i++;
        }
        j = 0;
        while(i<l1){
            a[i++] =  b[j++];
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = mergeSortedArrays(new int[]{1,1,2,3,3,0,0,0,0},new int[]{1,1,2,4});
        for(int e: a) System.out.print(e+" ");
    }
}
