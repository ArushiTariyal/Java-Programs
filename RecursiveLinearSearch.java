public class RecursiveLinearSearch {
    public static String linearSearch(int[] arr, int l, int i, int key){
        if(i==l) return "Not Found";
        if(arr[i]==key) return "Found at index "+i;
        return linearSearch(arr,l, i+1,key);
    }

    public static void main(String[] args) {
        int[] a = {2,3,6,4,3,8,9,0};
        int b[] ={2,3,6,4,3,8,9,0} ;
        System.out.println();
        System.out.println(linearSearch(a,a.length,0,8));
        System.out.println(linearSearch(b,b.length,0,-1));
    }
}
