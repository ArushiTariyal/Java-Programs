import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PrintAllDivisors {
    public static void main(String[] args){
        int num = 36;
        List<Integer> ans = new ArrayList<>();
        for(int i= 1; i*i<=36; i++){
            if(num%i==0){
                ans.add(i);
                if(num/i!=i) ans.add(num/i);
            }
        }
        Collections.sort(ans);
        for(int e: ans) System.out.print(e+" ");
    }
}
