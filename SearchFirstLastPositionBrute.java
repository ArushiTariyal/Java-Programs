public class SearchFirstLastPositionBrute {
    public static void search(int[] arr, int target){
        int start = -1;
        int end = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                start = i;
                break;
            }
        }
        if(start != -1){
            end = start;
            for(int i = start+1; i<arr.length; i++){
                if(arr[i]==target) end++;
                else break;
            }

        }
        System.out.println(start+","+end);
    }
}
