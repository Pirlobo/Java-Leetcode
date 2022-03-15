import java.util.*;
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        // result list {4, 2, 5, 1, 6, 3}
        
        //  1
        //2     3
    // 4    5  6   7
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null) return result;
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()){
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
