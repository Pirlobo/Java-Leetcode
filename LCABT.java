public class LCABT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //                      3 
        //              5                1
        //      6           2       0           8
        //              7      4

        // Test case 1 : 7 8  -> 3
        // Test case 1 : 5 4  -> 2
        if(root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
