import java.util.*;

public class VerticalOrderTraversalBT {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
              this.right = right;
          }
      }


    class Pair{
        TreeNode node;
        int column;
        int row;

        Pair(TreeNode node, int column, int row){
            this.node = node;
            this.column = column;
            this.row = row;
        }
    }
    class Solution {

        public List<List<Integer>> verticalTraversal(TreeNode root)
        { List<List<Integer>> ansList = new ArrayList<>();
            if(root==null) return ansList;

            Map<Integer,List<int[]>> hm = new TreeMap<>();

            TreeNode node = root;
            Queue<Pair> q = new LinkedList<>();

            q.offer(new Pair(node,0,0));

            while(!q.isEmpty()){
                int size = q.size();

                for(int i = 0; i<size; i++){
                    Pair p = q.poll();
                    TreeNode tnode = p.node;
                    int col = p.column;
                    int roww = p.row;

                    if(hm.containsKey(col)){
                        List<int[]> l = hm.get(col);
                        l.add(new int[]{roww, tnode.val});
                    }
                    else{
                        List<int[]> l = new ArrayList<>();
                        l.add(new int[] {roww,tnode.val});
                        hm.put(col,l);
                    }

                    if(tnode.left!=null) q.offer(new Pair(tnode.left, col-1,roww+1));
                    if(tnode.right != null) q.offer(new Pair(tnode.right, col+1,roww+1));
                }


            }

            for(Map.Entry<Integer, List<int[]>> e: hm.entrySet()){
                List<int[]> l = e.getValue();

                Collections.sort(l,(a,b) -> {
                    if(a[0]!=b[0]) return a[0]-b[0];
                    return a[1]-b[1];
                });

                List<Integer> minilist = new ArrayList<>();
                for(int[] el : l){
                    minilist.add(el[1]);
                }
                ansList.add(minilist);
            }
            return ansList;

        }
    }
}
