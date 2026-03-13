import java.util.ArrayList;
import java.util.List;

public class MorrisInorderTraversalOfBT {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
}

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            TreeNode curr = root;
            List<Integer> inorder = new ArrayList<>();

            while(curr!=null){
                if(curr.left == null){
                    inorder.add(curr.val);
                    curr = curr.right;
                }
                else{
                    TreeNode temp = curr.left;
                    while(temp.right!=null && temp.right!=curr){
                        temp = temp.right;
                    }

                    if(temp.right==null){
                        temp.right = curr;
                        curr = curr.left;
                    }
                    else{
                        inorder.add(curr.val);
                        temp.right = null;
                        curr = curr.right;
                    }
                }
            }
            return inorder;

        }
    }
}
