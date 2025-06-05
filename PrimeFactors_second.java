import java.util.List;
import java.util.ArrayList;
public class PrimeFactors_second {
    public static void main(String[] args){
        int num = 788;
        List<Integer> ans = new ArrayList<>();
        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                ans.add(i);
                while(num%i==0){
                    num /= i;
                }
            }
        }
        if(num!=1) ans.add(num);
        for(int e: ans) System.out.print(e+" ");
    }
}
