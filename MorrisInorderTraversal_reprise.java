import java.util.ArrayList;
import java.util.List;

public class MorrisInorderTraversal_reprise {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;         this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public TreeNode findIP(TreeNode curr){
            TreeNode IP = curr.left;
            while(IP.right!=null && IP.right!=curr){
                IP = IP.right;
            }
            return IP;
        }
        public List<Integer> inorderTraversal(TreeNode root) {
            TreeNode curr = root;
            List<Integer> inorder = new ArrayList<>();

            while(curr!=null){
                if(curr.left==null){
                    inorder.add(curr.val);
                    curr = curr.right;
                }
                else{
                    TreeNode IP = findIP(curr);
                    if(IP.right ==null){
                        IP.right = curr;
                        curr = curr.left;
                    }
                    else{
                        inorder.add(curr.val);
                        IP.right = null;
                        curr = curr.right;
                    }
                }
            }
            return inorder;

        }
    }
}
