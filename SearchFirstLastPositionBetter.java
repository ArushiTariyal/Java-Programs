public class SearchFirstLastPositionBetter {
    public static void search(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                high = mid-1;
            }
            else low  = mid+1;
        }
        int start = low;
        int end = start;
        for(int i = start+1; i<arr.length; i++){
            if(arr[i]==target) end++;
            else break;
        }
        System.out.println(start+","+ end);
    }
}
