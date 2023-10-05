public class Sort01 {
    public static void main(String[] args){
        int[] arr = {0,1,1,1,0,0,1,0,1,0,0,0};
        int i = 0;
        int j;
        while(i<=arr.length-1){
            j = 0;
            while(j<arr.length-1-i){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                j++;
            }
            i++;
        }
        for(int e: arr) System.out.print(e+" ");
    }
}
