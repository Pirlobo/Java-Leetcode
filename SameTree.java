/**
 * SameTree
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null) {
            boolean isSameTree = ( (p.val == q.val) 
                                  && isSameTree(p.left, q.left) 
                                  && isSameTree(p.right, q.right)
                                 );
             return isSameTree;
        }
         return false;
     }
}