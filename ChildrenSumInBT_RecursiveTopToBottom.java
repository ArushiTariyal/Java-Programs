public class ChildrenSumInBT_RecursiveTopToBottom {
     class TreeNode {
    int val;
    TreeNode left, right;
     TreeNode(int x) { val = x; }
 }

    class Solution {
        int leftval = 0;
        int rightval = 0;
        boolean checkChildrenSum(TreeNode root) {
            if(root==null) return true;

            if(root.left==null && root.right==null) return true;

            leftval = (root.left==null)? 0:root.left.val;
            rightval = (root.right==null)? 0:root.right.val;

            return (root.val == leftval + rightval) && checkChildrenSum(root.left) && checkChildrenSum(root.right);
        }
    }

}
