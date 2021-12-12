import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> current = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode polledTreeNode = queue.remove();
                current.add(polledTreeNode.val);
                if (polledTreeNode.left != null)
                    queue.add(polledTreeNode.left);
                if (polledTreeNode.right != null)
                    queue.add(polledTreeNode.right);
            }
            list.add(current);
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
