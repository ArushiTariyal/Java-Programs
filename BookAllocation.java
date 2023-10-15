public class BookAllocation {
    public static int allocation(int[] arr, int books, int students){
        int s = arr[0];
        int sum = 0;
        int ans = -1;
        int mid;
        for(int i = 1; i<arr.length; i++) sum += arr[i];
        int e = sum;

        while(s<=e){
            mid = s + (e-s)/2;
            if(isPossible(arr,books,students,mid)) {
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
    public static boolean isPossible(int[] arr,int books, int students, int mid){
        int stuCount = 1;
        int pageCount;
        int i = 0;
        while(stuCount<=students) {
            pageCount = 0;
            while (i < books) {
                if (pageCount + arr[i] <= mid){
                    pageCount += arr[i];
                    i++;
                }
                else break;
            }
            ++stuCount;
        }
        return i==books;

        //for loop
        /*
        for(int i = 0; i<books; i++){
            if(pageCount+arr[i]<=mid){
                pageCount += arr[i];
            }
            else{
                stuCount++;
                if(stuCount>students || arr[i]>mid) return false;
                pageCount = arr[i];
            }
        }
        return true;
         */
    }
    public static void main(String[] args){
        System.out.println(allocation(new int[] {10,20,30,40},4,2));
    }
}
