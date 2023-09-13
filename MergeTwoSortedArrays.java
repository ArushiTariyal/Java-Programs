public class MergeTwoSortedArrays {
    public static void main(String[] args){
        int[] a = {1,3,5,6,7};
        int[] b = {2,3,4,5,8,8};
        int[] c = new int[a.length+b.length];
        int k=0, i=0, j=0;
        while(i <= a.length-1 && j <= b.length-1){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if(i != a.length){
            while(i != a.length){
                c[k] = a[i];
                k++;
                i++;
            }
        }
        else{
            while (j!= b.length){
                c[k] = b[j];
                k++;
                j++;
            }
        }
        for(int e: c){
            System.out.print(e+" ");
        }
    }
}
