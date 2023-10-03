import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class IntersectionOfArrays {
    public static void main(String[] args){
        int[] ar1 = {1,2,3,3,4,4};
        int[] ar2 = {3,5,6,4,7,2,2};

        Set s1 = new HashSet<>();
        Set s2 = new HashSet<>();
        for(int e: ar1) s1.add(e);
        for(int e: ar2) s2.add(e);

        s1.retainAll(s2);
        
        System.out.println("Common elements are: "+s1 );
    }
}
