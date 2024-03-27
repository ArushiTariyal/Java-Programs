import java.util.*;

public class MaximumOfAllSubArrayOfSizeK {
    public static void findMax(int[] arr, int k){
        int j = 0, i=0;
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        while(j<arr.length){
            if(q.isEmpty() || arr[j]>q.peekLast()){
                q.add(arr[j]);
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                int max = q.peekLast();
                ans.add(max);
                if(max==arr[i]) q.pollFirst();
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        findMax(new int[]{1,3,-1,5,5,1,2,6,7},3);
    }
}
