import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalIterative {
        public class TreeNode {
            int data;
            TreeNode left;
            TreeNode right;
            TreeNode(int val) { data = val; left = null; right = null; }
        }

    class Solution {
        List<Integer> list = new ArrayList<>();

        public List<Integer> inorder(TreeNode root) {
            //your code goes here
            Stack<TreeNode> st = new Stack<>();
            TreeNode node = root;
            while (true) {
                if (node != null) {
                    st.push(node);
                    node = node.left;
                } else {
                    if (st.isEmpty()) break;
                    node = st.pop();
                    list.add(node.data);
                    node = node.right;
                }


            }
            return list;
        }
    }
}
