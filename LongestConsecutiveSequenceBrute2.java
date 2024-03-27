import java.util.*;

public class LongestConsecutiveSequenceBrute2 {
    public static void longestConsecutiveSequence(int[] arr){

        int count = 1;
        int maxLen = Integer.MIN_VALUE;
        int val = arr[0];
        boolean flag = false;
        for(int j = 0; j<=arr.length-1; j++){
            for(int i = 0; i<=arr.length-1; i++){
                if(arr[i]== val+1){
                    val = arr[i];
                    flag = true;
                    break;
                }

            }
            if(flag){
                count++;
                flag = false;
            }
            else{
                count = 1;
                val = arr[j];
            }
            maxLen = Math.max(maxLen,count);
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,10,11,12,13,14,15, 3, 2, 1, 4};
        longestConsecutiveSequence(arr);
    }
}


