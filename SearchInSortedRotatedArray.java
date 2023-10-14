public class SearchInSortedRotatedArray {
    public static void findPivot(int[] arr,int key){
        int n = arr.length-1;
        int s= 0, e = n, mid;
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]) s=mid+1;
            else e = mid;
        }
        System.out.println(e);
        if(arr[e]<=key && key<=arr[n]){
            System.out.println(binarySearch(arr,e,n,key));
        }
        else{
            System.out.println(binarySearch(arr,0,e-1,key));
        }

    }
    public static int binarySearch(int[] arr,int s, int e, int key){
        while(s<e){
            int mid = s+(e-s)/2;
            if(key>arr[mid]) s = mid+1;
            else e=mid;
        }
        return e;
    }
    public static void main(String[] args){
        findPivot(new int[] {7,8,9,1,2,3,4},2);
    }

}
