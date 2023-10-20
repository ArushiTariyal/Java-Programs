public class Lumberjack {
    public static int machineSetting(int[] arr, int trees, int woodLength){
        int s = 0, e = Integer.MIN_VALUE, mid, ans = 0;
        for(int i: arr) e = Math.max(e,i);
        while(s<=e){
            mid = s+(e-s)/2;
            if(isPossible(arr, trees, woodLength, mid)){
                ans = mid;
                s=mid+1;
            }
            else e = mid-1;
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int trees, int woodLength, int mid){
        int woodLengthObtained = 0;
        for(int i = 0; i<trees; i++){
            int log = arr[i]-mid;
            if(log>0) woodLengthObtained += log;
            if(woodLengthObtained>=woodLength) return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(machineSetting(new int[]{20,15,10,17},4,7));
        System.out.println(machineSetting(new int[]{4,42,40,26,46},5,20));
    }
}
