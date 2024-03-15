import java.util.ArrayDeque;

public class MinInSubArrayOfSizeKHashing {
    public static void minInSubArray(int[] a, int k){
        int j = 0;
        int min = 0;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        while(j<a.length){
            min = a[j];
            while(!ad.isEmpty() && ad.peekLast()>min) ad.pollLast();
            ad.add(min);
            if(j-k+1>=0){
                System.out.println(ad.peekFirst());
                if(ad.peekFirst()==a[j-k+1]) ad.pollFirst();
            }
            j++;
        }
    }
    public static void main(String[] args){
        minInSubArray(new int[]{-3,-9,-8,0,8,-16,0},3);
    }
}
