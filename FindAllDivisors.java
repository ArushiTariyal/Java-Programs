import java.util.List;
import java.util.ArrayList;
public class FindAllDivisors {
    public static void main(String[] args){
        int n = 45;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i*i<=n; i++){
            if(n%i==0){
                ans.add(i);
                if(n/i != i) ans.add(n/i);
            }
        }
        for(int e: ans) System.out.println(e);
    }
}
