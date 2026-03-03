import java.util.*;

public class BottomViewOfBT {

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Pair{
        int column;
        TreeNode node;

        Pair(int column, TreeNode node){
            this.column = column;
            this.node = node;
        }
    }

    class Solution {
        public List<Integer> bottomView(TreeNode root) {
            //your code goes here
            List<Integer> ansList = new ArrayList<>();
            if(root==null) return ansList;

            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(0,root));

            Map<Integer,Integer> tm = new TreeMap<>();

            while(!q.isEmpty()){
                Pair p = q.poll();
                TreeNode node = p.node;
                int column = p.column;

                tm.put(column, node.data);

                if(node.left!=null) q.offer(new Pair(column-1,node.left));
                if(node.right!=null) q.offer(new Pair(column+1,node.right));
            }

            for(Map.Entry<Integer,Integer> e : tm.entrySet()){
                ansList.add(e.getValue());
            }
            return ansList;
        }
    }
}
