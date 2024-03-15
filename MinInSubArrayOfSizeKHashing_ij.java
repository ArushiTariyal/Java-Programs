import java.util.ArrayDeque;

public class MinInSubArrayOfSizeKHashing_ij {
    public static void minInSubArray(int[] a, int k){
        int j = 0;
        int i = 0;
        int min;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        while(j<a.length){
            min = j;
            while (!ad.isEmpty() && a[ad.peekLast()] > a[min]) ad.pollLast();
            ad.add(min);
            if(j-i+1==k){
                System.out.println(a[ad.peekFirst()]);
                if(ad.peekFirst()==i) ad.pollFirst();
                i++;

            }
            j++;
        }
    }
    public static void main(String[] args){
        minInSubArray(new int[]{-3,-9,-8,0,8,-16,0},3);
    }
}


