import java.util.ArrayDeque;


public class FindingMinInSubArrayOfSizeK {
    public static void findMin(int[] a,int k){
        int i = 0, j = 0;
        int[] ans = new int[a.length-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        while(j<=a.length-1){
            if(!q.isEmpty() && q.peek()==j-k) q.poll();
           while(!q.isEmpty() && a[q.peekLast()]>a[j]){
               q.pollLast();
            }
           q.offer(j);
           if(j-k+1>=0) {
               ans[i++] = a[q.peek()];
           }
           j++;
        }
        for(int e: ans) System.out.print(e+" ");
    }
    public static void main(String[] args){
        findMin(new int[]{-3,-9,-8,0,8,-16,0},3);
    }
}
