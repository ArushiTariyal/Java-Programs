import java.util.ArrayList;
import java.util.List;

public class FindMinimumOfSubArraysOfSizeK {

        public static void  printMinimumInteger(long A[], int N, int K)
        {
            long mini = 0;
            List<Long> l = new ArrayList<>();
            int i = 0, j=0;
            while(j<=N-1){
                mini = Math.min(mini,A[j]);
                if(j-i+1<K) j++;
                else if(j-i+1==K){
                    l.add(mini);
                    i++;
                    mini=A[i];
                    j++;
                }
            }
            System.out.println(l);

    }

    public static void main(String[] args) {
        printMinimumInteger(new long[]{-3,-2,0,8,-8,6,0},7,3);
    }
}
