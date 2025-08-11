import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InPrePostOrderTraversalInOneStack_Iterative {
      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null;}
      }


    class Pair{
        TreeNode node;
        int num;

        Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }
    class Solution {
        List<List<Integer>> treeTraversal(TreeNode root) {
            //your code goes here
            if(root==null) return new ArrayList<>();

            Stack<Pair> st = new Stack<>();
            st.push(new Pair(root,1));

            List<Integer> pre = new ArrayList<>();
            List<Integer> ino = new ArrayList<>();
            List<Integer> post = new ArrayList<>();

            while(!st.isEmpty()){
                Pair p = st.peek();
                if(p.num==1){
                    pre.add(p.node.data);
                    p.num = 2;
                    if(p.node.left != null) st.push(new Pair(p.node.left, 1));
                }
                else if(p.num==2){
                    ino.add(p.node.data);
                    p.num=3;
                    if(p.node.right!=null) st.push(new Pair(p.node.right,1));
                }
                else{
                    post.add(p.node.data);
                    st.pop();
                }
            }

            List<List<Integer>> ans = new ArrayList<>();
            ans.add(ino);
            ans.add(pre);
            ans.add(post);
            return ans;
        }
    }
}
