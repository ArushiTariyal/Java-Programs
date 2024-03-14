import java.util.ArrayDeque;

public class FindingMinInSubArrayOfSizeKII {

        public static void pop(int[] a, int k){
            int j = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            while(j<=a.length-1){
                while(!q.isEmpty() && a[q.peekLast()]>=a[j]) q.pollLast();
                q.offer(j);
                if(j-k+1>=0){
                    System.out.println(a[q.peekFirst()]);
                    if(!q.isEmpty() && q.peekFirst()<=j-k+1) q.pollFirst();
                }
                j++;
            }
        }
        public static void main(String[] args) {
            pop(new int[]{-3,-9,-8,0,8,-16,0},3);
        }

}
