public class FindOutHowManyTimesArrayIsRotatedDuplicatesII_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int ind = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                if(ans>arr[low]){
                    ans = arr[low];
                    ind = low;
                }
                low++;
                high--;
                continue;
            }
            if(arr[low]<arr[high]){
                if(ans>arr[low]){
                    ans = arr[low];
                    ind = low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(ans>arr[low]){
                    ans = arr[low];
                    ind = low;
                }
                low = mid+1;
            }
            else{
                if(ans>arr[mid]){
                    ans = arr[mid];
                    ind = mid;
                }
                high = mid-1;
            }
        }
        System.out.println(ind);
    }
}
