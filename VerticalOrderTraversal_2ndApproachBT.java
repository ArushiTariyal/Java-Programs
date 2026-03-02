import java.util.*;

public class VerticalOrderTraversal_2ndApproachBT {

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

            TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>> hm = new TreeMap<>();

            TreeNode node = root;
            Queue<Pair> q = new LinkedList<>();

            q.offer(new Pair(node,0,0));

            while(!q.isEmpty()){
                int size = q.size();
                Pair p = q.poll();
                TreeNode tnode = p.node;
                int col = p.column;
                int row = p.row;


                hm.putIfAbsent(col, new TreeMap<Integer, PriorityQueue<Integer>>());
                hm.get(col).putIfAbsent(row, new PriorityQueue<Integer>());
                hm.get(col).get(row).offer(tnode.val);

                if(tnode.left!=null) q.offer(new Pair(tnode.left, col-1,row+1));
                if(tnode.right != null) q.offer(new Pair(tnode.right, col+1,row+1));

            }

            for(TreeMap<Integer,PriorityQueue<Integer>> tm : hm.values()){
                List<Integer> miniList = new ArrayList<>();
                for(PriorityQueue<Integer> pq : tm.values()){
                    while(!pq.isEmpty()) miniList.add(pq.poll());
                }
                ansList.add(miniList);
            }


            return ansList;

        }
    }
}
