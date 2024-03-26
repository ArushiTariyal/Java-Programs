import java.util.ArrayList;

public class LeadersInArrayBrute{
    public static void findLeaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<=arr.length-1; i++){
            boolean leader = true;
            for(int j = i+1; j<=arr.length-1; j++){
                if(arr[i]<=arr[j]){
                    leader = false;
                    break;
                }
            }
            if(leader) ans.add(arr[i]);
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        findLeaders(new int[]{10,22,12,3,0,6});
    }
}
