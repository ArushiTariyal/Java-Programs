public class FirstLastOccurrence {
    public static void main(String[] args){
        System.out.println(firstOccurrence(new int[] {1,2,3,3,3,3,4,6},3));
        System.out.println(lastOccurrence(new int[] {1,2,3,3,3,3,4,6},3));
        System.out.println(firstOccurrence(new int[] {1,2,3,4,6},4));
        System.out.println(lastOccurrence(new int[] {1,2,3,4,6},4));
    }
    public static int firstOccurrence(int[] arr,int key){
        int start=0,end = arr.length-1,mid;
        int firstIndex = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]<key) start = mid+1;
            else if(arr[mid]>key) end = mid-1;
            else{
                firstIndex = mid;
                end = mid-1;
            }
        }
        return firstIndex;
    }
    public static int lastOccurrence(int[] arr,int key){
        int start=0,end = arr.length-1,mid;
        int lastIndex = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]<key) start = mid+1;
            else if(arr[mid]>key) end = mid-1;
            else{
                lastIndex = mid;
                start = mid+1;
            }
        }
        return lastIndex;
    }
}
