public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] a, int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        int l1 = a.length;
        int l2 = b.length;
        int[] c = new int[l1+l2];
        while(i<l1 && j<l2){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else c[k++] = b[j++];
        }
        while(i<l1){
            c[k++] = a[i++];
        }
        while(j<l2){
            c[k++] = b[j++];
        }
        return c;
    }
    public static void main(String[] args){
        for(int e: mergeSortedArrays(new int[] {1,2,2,2,2,3,3,3,4}, new int[] {1,1,5,6,7})) System.out.print(e+" ");
    }
}
