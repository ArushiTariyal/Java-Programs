import java.util.Arrays;

public class TwoSumOptimalYesNo {
        public static String read(int n, int []book, int target){
            Arrays.sort(book);
            int left = 0;
            int right = n-1;
            while(left<right){
                if(book[left]+book[right] < target) left++;
                else if(book[left]+book[right]>target) right--;
                else return "YES";
            }
            return "NO";
        }

}
