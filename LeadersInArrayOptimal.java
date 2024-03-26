import java.util.ArrayList;

public class LeadersInArrayOptimal {
    public static void findLeaders(int[] arr){
        int leader = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>leader){
                ans.add(arr[i]);
                leader = arr[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        findLeaders(new int[]{10,22,12,3,0,6});
    }
}
