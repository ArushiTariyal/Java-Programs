public class FindMinInSortedRotatedArray {
    public static int findPivot(int[] arr){
        int s = 0, e = arr.length-1,mid;
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]) s=mid+1;
            else e = mid;
        }
        return e;
    }
    public static void main(String[] args){
        System.out.println(findPivot(new int[] {7,7,7,9,1,2,3,4,5}));
        System.out.println(findPivot(new int[] {6,7,9,1,2,2,3,4,5}));
        System.out.println(findPivot(new int[] {4,5,5,6,7,9,1}));
    }
}
