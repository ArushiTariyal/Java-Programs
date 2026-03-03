public class CheckForSymmetricBT {

      public class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode(int val) { data = val; left = null; right = null; }
      }


    class Solution {
        public boolean findSym(TreeNode p, TreeNode q){
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;

            if(p.data==q.data){
                return findSym(p.left,q.right) && findSym(p.right,q.left);
            }
            return false;
        }
        public boolean isSymmetric(TreeNode root) {
            //your code goes here
            TreeNode node = root;
            return findSym(root,root);

        }
    }
}
