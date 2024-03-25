import java.util.Collections;
import java.util.List;

public class NextPermutationOptimal2 {

        public static List< Integer > nextGreaterPermutation(List< Integer > A) {
            int ind = -1;
            for(int i = A.size()-2; i>=0; i--){
                if(A.get(i)<A.get(i+1)){
                    ind = i;
                    break;
                }
            }
            if(ind== -1){

                Collections.reverse(A);
                return A;
            }
            for(int i = A.size()-1; i>ind; i--){
                if(A.get(i)>A.get(ind)){
                    Collections.swap(A,ind,i);
                    break;
                }
            }
            Collections.reverse(A.subList(ind+1,A.size()));
            return A ;
        }
    
}
