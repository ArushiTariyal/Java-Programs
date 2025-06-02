import java.util.ArrayList;
import java.util.List;
public class FindAllPrimeFactorsOfANumber_Optimal {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();
        int n = 37;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                ans.add(i);
                while(n%i==0){
                    n /=i;
                }
            }
        }
        if(n!=1) ans.add(n);
        for(int e: ans) System.out.print(e+" ");
    }
}
