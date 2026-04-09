public class FindInorderSuccessorBST {
      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null, right = null }
      }

    class Solution {
        TreeNode succPredBST(TreeNode root, int key) {
            //your code goes here
            TreeNode curr = root;
            TreeNode ans = null;
            while(curr!=null){
                if(curr.data>key){
                    ans = curr;
                    curr = curr.left;
                }
                else{
                    curr = curr.right;
                }
            }
            return ans;
        }
    }
}
