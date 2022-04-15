public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
         invertTree(root.right);

        return root;
    }
}
