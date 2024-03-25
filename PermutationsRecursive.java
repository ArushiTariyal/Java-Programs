import java.util.*;

public class PermutationsRecursive {
    public static void permutations(int[] ip, int i, int[] mark,Set<List<Integer>> ans, List<Integer> op){
        if(op.size()==ip.length){
            ans.add(new ArrayList<>(op));
            return;
        }
        for(int j = 0; j<ip.length; j++) {
            if (mark[j] == 0) {
                mark[j]=1;
                op.add(ip[j]);
                permutations(ip, i + 1,mark, ans, op);
                op.remove(op.size() - 1);
                mark[j]=0;

            }

        }
    }

    public static void main(String[] args) {
        int[] ip = {3,1,2};
        Set<List<Integer>> ans= new HashSet<>();
        List<Integer> op = new ArrayList<>();
        int[] mark = new int[ip.length];

        permutations(ip,0,mark,ans,op);
        System.out.println(ans);
    }
}
