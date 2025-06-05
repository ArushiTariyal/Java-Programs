import java.util.*;
public class PrimeFactorisation_Optimal_SmallestPrimeFactor {
    class Solution {
        public List<List<Integer>> primeFactors(int[] queries) {
            //your code goes here
            int[] primes = new int[100001];
            for(int i = 1; i<primes.length; i++){
                primes[i] = i;
            }
            for(int i = 2; i*i<primes.length; i++){
                if(primes[i]==i){
                    for(int j = i*i; j<primes.length; j=j+i){
                        if(primes[j]==j) primes[j] = i;
                    }
                }
            }

            List<List<Integer>> ans = new ArrayList<>();
            for(int i = 0; i<queries.length; i++){
                int num = queries[i];
                List<Integer> factors = new ArrayList<>();
                while(num!=1){
                    int factor = primes[num];
                    num = num/factor;
                    factors.add(factor);
                }
                ans.add(factors);
            }
            return ans;
        }
    }
}
