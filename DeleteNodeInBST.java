public class DeleteNodeInBST {
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
        public TreeNode helper(TreeNode target){
            if(target.right==null){
                return target.left;
            }
            if(target.left==null) return target.right;
            TreeNode send = target.left;
            TreeNode attach = target.right;
            target = target.left;
            while(target.right!=null){
                target = target.right;
            }
            target.right = attach;
            return send;
        }
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null) return root;
            if(root.val==key){
                return helper(root);
            }
            TreeNode temp = root;
            while(temp!=null){
                if(temp.val<key){
                    if(temp.right!=null && temp.right.val==key){
                        temp.right = helper(temp.right);
                        break;
                    }
                    else temp = temp.right;
                }
                else{
                    if(temp.left!=null && temp.left.val==key){
                        temp.left = helper(temp.left);
                        break;
                    }
                    else temp = temp.left;
                }
            }
            return root;
        }
    }
}
