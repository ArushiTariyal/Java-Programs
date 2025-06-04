import java.util.List;
import java.util.ArrayList;
public class PrimeFactorisation_Brute {
    public static void main(String[] args){
        int num = 12;
        List<Integer> ans =  new ArrayList<>();
        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                while(num%i==0){
                    ans.add(i);
                    num = num/i;
                }
            }
        }
        if(num>1) ans.add(num);
        for(int e: ans) System.out.println(e+" ");
    }
}
