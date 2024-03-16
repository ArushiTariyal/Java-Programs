import java.util.ArrayList;
import java.util.List;

public class MaxInSubArrays {
    public static void maxElement(int[] ip, int k){
        int i = 0;
        int j = 0;
        int maxi = Integer.MIN_VALUE;
        List<Integer> al = new ArrayList<>();
        while(j<ip.length){
            maxi = Math.max(maxi,ip[j]);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                al.add(maxi);
                if(maxi==ip[i]) maxi = ip[i+1];
                i++;
                j=i+1;
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args){
        maxElement(new int[]{3,7,0,7,-4,-2,-1,8,100,5},3);
    }
}
