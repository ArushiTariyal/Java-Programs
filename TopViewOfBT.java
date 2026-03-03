import java.util.*;

public class TopViewOfBT {
      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Pair{
        TreeNode node;
        int column;

        Pair( int column, TreeNode node){
            this.node = node;
            this.column = column;
        }
    }

    class Solution {
        public List<Integer> topView(TreeNode root) {
            //your code goes here
            List<Integer> ansList = new ArrayList<>();
            if(root==null) return ansList;
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(0,root));

            TreeMap<Integer,Integer> tm = new TreeMap<>();

            while(!q.isEmpty()){
                Pair p = q.poll();
                TreeNode node = p.node;
                int col = p.column;

                if(!tm.containsKey(col)){
                    tm.put(col,node.data);
                }

                if(node.left!=null){
                    q.offer(new Pair(col-1,node.left));
                }
                if(node.right!=null) q.offer(new Pair(col+1,node.right));
            }

            for(Map.Entry<Integer,Integer> e : tm.entrySet()){
                ansList.add(e.getValue());
            }
            return ansList;
        }
    }
}
