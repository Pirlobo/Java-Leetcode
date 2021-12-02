import java.util.*;
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null) return result;
        TreeNode current = root;
        while(root!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            };
            
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
