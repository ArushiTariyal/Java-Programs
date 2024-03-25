import java.util.*;

public class NextPermutation {

        public static void permutations(int[] ip, int i, int[] mark, ArrayList<List<Integer>> ans, List<Integer> op){
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
        public static void nextPermutation(ArrayList<List<Integer>> ans, List<Integer> find){
            for(int i = 0; i<ans.size(); i++){
                if(ans.get(i)==find){
                    if(i!= ans.size()-1) System.out.println(ans.get(i+1));
                    else System.out.println(ans.get(0));
                    break;
                }
            }
        }

        public static void main(String[] args) {
            int[] ip = {3,1,2};
            ArrayList<List<Integer>> ans= new ArrayList<>();
            List<Integer> op = new ArrayList<>();
            int[] mark = new int[ip.length];

            permutations(ip,0,mark,ans,op);
            Collections.sort(ans, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0).compareTo(o2.get(0));
                }
            });
            System.out.println(ans);

            nextPermutation(ans,ans.get(5));
        }
    }


