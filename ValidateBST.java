import java.util.*;
public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        isValidBST(root);
    }
    public static boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();   
        double left = - Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while ( root!=null ){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= left ) return false;
            left = root.val;
            root = root.right; 
        }
        return true; 
        
        // return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    // public static boolean helper(TreeNode root, long min, long max) {
    //     if (root == null) return true;
    //     if (root.val <= min || root.val >= max) return false;
    //     return helper(root.left, min, root.val) &&
    //            helper(root.right, root.val, max);
    // }
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
