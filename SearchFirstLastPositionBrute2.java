public class SearchFirstLastPositionBrute2 {
    public static void search(int[] arr, int target){
        int first = -1, last = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                if(first == -1) first = i;
                else last = i;
            }
        }
        System.out.println(first+","+last);
    }
}
