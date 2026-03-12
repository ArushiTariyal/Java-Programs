import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBT {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "null,";
            StringBuffer sb = new StringBuffer();

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            sb.append(root.val).append(",");

            while (!q.isEmpty()) {
                int size = q.size();

                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();

                    if (node.left != null) {
                        q.offer(node.left);
                        sb.append(node.left.val).append(",");
                    } else sb.append("null,");

                    if (node.right != null) {
                        q.offer(node.right);
                        sb.append(node.right.val).append(",");
                    } else sb.append("null,");
                }
            }

            String str = sb.toString();
            return str;

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] strElements = data.split(",");

            if (strElements[0].equals("null")) return null;
            Queue<TreeNode> q = new LinkedList<>();
            TreeNode root = new TreeNode(Integer.parseInt(strElements[0]));
            q.offer(root);

            int n = strElements.length;
            int i = 1;

            while (!q.isEmpty() && i < n) { //change condition for i value
                TreeNode node = q.poll();
                if (!strElements[i].equals("null")) {
                    TreeNode leftNode = new TreeNode(Integer.parseInt(strElements[i]));
                    node.left = leftNode;
                    q.offer(leftNode);
                }
                i++;
                if (!strElements[i].equals("null")) {
                    TreeNode rightNode = new TreeNode(Integer.parseInt(strElements[i]));
                    node.right = rightNode;
                    q.offer(rightNode);
                }
                i++;
            }

            return root;
        }
    }

}