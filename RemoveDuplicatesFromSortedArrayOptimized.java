public class RemoveDuplicatesFromSortedArrayOptimized {
    public static void unique(int[] a, int i, int j){
        if(i>=a.length){
            System.out.printf("There are %d unique elements\n",j+1);
            for(int k = 0; k<=j;k++ ) System.out.print(a[k]+" ");
            return;
        }
        if(a[j]!=a[i]) a[++j] = a[i];
        unique(a,i+1,j);
    }
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,2,3,3,4};
        unique(a,1,0);
    }
}
