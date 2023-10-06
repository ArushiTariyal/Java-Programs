public class Sort012DutchNationalFlagAlgo {
    public static void main(String[] args){
        int[] arr = Sort012DutchNationalFlagAlgo.sort012(new int[] {2 ,0 ,1 ,1 ,2, 0,2});
        for(int e: arr ){
            System.out.print(e+" ");
        }
    }
    public static int[] sort012(int[] arr)
    {
        int l = 0,mid = 0, h = arr.length-1;
        while(mid<=h){
            if(arr[mid]==0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;

            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
            }
            else mid++;
        }
        return arr;
    }
}
