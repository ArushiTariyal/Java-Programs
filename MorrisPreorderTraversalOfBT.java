import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversalOfBT {

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

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> pre = new ArrayList<>();
            TreeNode curr = root;

            while(curr!=null){
                if(curr.left==null){
                    pre.add(curr.val);
                    curr = curr.right;
                }
                else{
                    TreeNode temp = curr.left;
                    while(temp.right!=null && temp.right!=curr){
                        temp = temp.right;
                    }
                    if(temp.right==null){
                        pre.add(curr.val);
                        temp.right = curr;
                        curr = curr.left;
                    }
                    else{
                        temp.right = null;
                        curr = curr.right;
                    }
                }
            }
            return pre;
        }
    }
}
