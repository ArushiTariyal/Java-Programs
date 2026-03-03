import java.util.*;

public class RightLeftViewOfBT {
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { data = val; left = null; right = null; }
    }
    class Pair{
        int row;
        TreeNode node;

        Pair(int row, TreeNode node){
            this.row = row;
            this.node = node;
        }
    }
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            //your code goes here
            List<Integer> ansList = new ArrayList<>();
            if(root==null) return ansList;

            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(0,root));

            TreeMap<Integer, Integer> map = new TreeMap<>();

            while(!q.isEmpty()){
                Pair p = q.poll();

                TreeNode node = p.node;
                int row = p.row;

                map.put(row,node.data);
                if(node.left!=null) q.offer(new Pair(row+1,node.left));
                if(node.right!=null) q.offer(new Pair(row+1,node.right));


            }
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                ansList.add(e.getValue());
            }
            return ansList;

        }

}}
