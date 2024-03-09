import java.util.ArrayList;
import java.util.List;

public class FirstNegativeIntegerOfSubArraysOfSizeK {

        public static void  printFirstNegativeInteger(long A[], int N, int K)
        {
            List<Long> l = new ArrayList<>();
            List<Long> ans = new ArrayList<>();
            int i = 0, j=0;
            while(j<=N-1){
                if(A[j]<0) l.add(A[j]);
                if(j-i+1<K) j++;
                else if(j-i+1==K){
                    if(l.size()==0) ans.add(0L);
                    else{
                        ans.add(l.get(0));
                        if(A[i]==l.get(0)) l.remove(A[i]);
                    }
                    i++;
                    j++;
                }
            }
            System.out.println(ans);

    }

    public static void main(String[] args) {
        printFirstNegativeInteger(new long[]{-3,-2,0,8,-8,-16,0},7,3);
    }
}
