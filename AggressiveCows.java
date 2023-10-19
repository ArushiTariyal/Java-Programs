import java.util.Arrays;
public class AggressiveCows {
    public static boolean isPossible(int[] arr, int cows, int mid){
        int lastPos = arr[0];
        int cowCount = 1;
        for (int j : arr) {
            if (j - lastPos >= mid) {
                cowCount++;
                lastPos = j;
                if(cows==cowCount) return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] arr, int cows){
        Arrays.sort(arr);
        int s = arr[0] ,e = arr[arr.length-1];
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(arr,cows,mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = aggressiveCows(new int[]{4,3,1,2,6,5,7,8},3);
        System.out.println(ans);
    }
}
