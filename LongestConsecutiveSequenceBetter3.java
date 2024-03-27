import java.util.Arrays;

public class LongestConsecutiveSequenceBetter3 {
    public static void longestConsecutiveSequence(int[] arr){

        int count = 0;
        int maxLen = Integer.MIN_VALUE;
        int lastSmallest = arr[0];
        for(int i = 0; i<=arr.length-1; i++) {
            if (arr[i] == lastSmallest+1) {
                count++;
                lastSmallest = arr[i];
                maxLen = Math.max(maxLen,count);
            }
            else if(arr[i] == lastSmallest) continue;
            else if(arr[i] > lastSmallest){
                lastSmallest = arr[i];
                count = 1;
            }
        }


        System.out.println(maxLen);
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,10,11,9,10,1,3,5,4,12,13,14,15, 3, 2,1, 1, 4};
        Arrays.sort(arr);
        longestConsecutiveSequence(arr);
    }
}
