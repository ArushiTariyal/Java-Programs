public class KthSmallestInBST_MorrisTraversal {

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
        int count = 0;
        public TreeNode findIP(TreeNode curr){
            TreeNode IP = curr.left;
            while(IP.right!=null && IP.right!=curr){
                IP = IP.right;
            }
            return IP;
        }
        public int traversal(TreeNode root, int k){
            int count = 0;
            int value = -1;
            TreeNode curr = root;
            while(curr!=null){
                if(curr.left==null){
                    count++;
                    if(count==k){
                        value = curr.val;
                        break;
                    }
                    curr = curr.right;
                }
                else{
                    TreeNode IP = findIP(curr);
                    if(IP.right==null){
                        IP.right = curr;
                        curr = curr.left;
                    }
                    else{
                        count++;
                        if(count==k){
                            value = curr.val;
                            break;
                        }
                        IP.right = null;
                        curr = curr.right;
                    }
                }
            }
            return value;
        }
        public int kthSmallest(TreeNode root, int k) {
            return traversal(root,k);
        }
    }
}
