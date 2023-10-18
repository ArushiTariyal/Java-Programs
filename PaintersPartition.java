public class PaintersPartition {
    public static int minTime(int[] arr, int painters){
        int s = 0, e = 0, mid, ans=1;
        for(int i : arr) e += i;
        while(s<=e){
            mid = s+(e-s)/2;
            if(midPartition(arr, painters, mid)){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
    public static boolean midPartition(int[] arr, int painters, int mid){
        int painterCount = 1;
        int i = 0;
//        while(painterCount<=painters){
//            int time = 0;
//            while(i<arr.length){
//                if (time+arr[i]<= mid) {
//                    time += arr[i];
//                    i++;
//                }
//                else break;
//            }
//            painterCount++;
//        }
//        return i==arr.length;

        int time = 0;
        for(int y : arr){
            if(time+y<=mid){
                time += y;
            }
            else{
                painterCount++;
                if(painterCount>painters||y>mid) return false;
                time = y;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(minTime(new int[]{5,5,5,5},2));
    }
}
