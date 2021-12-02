// Reference Link : https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

import java.util.*;

public class BST {

    private int length;
    private Node root;

    public static void main(String[] args) {
        Integer[] nodes = new Integer[] { 5, 3, 2, 8, 4, 6, 10 };
        BST bst = new BST(nodes);
        System.out.println("Binary Search Tree : ");
        bst.displayTree();
        System.out.println();
        System.out.println("Sum of all greater keys : ");
        bst.displayUpdatedTree();
    }

    BST() {
        length = 0;
        root = null;
    }

    BST(Integer[] values) {
        this();
        for (int val : values) {
            insert(val);
        }
    }

    public void insert(Integer value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;

            while (true) {
                int result = value.compareTo(current.getValue());
                if ( result <= 0) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        return;
                    }
                    current = current.getLeft();
                } else {
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        return;
                    }
                    current = current.getRight();
                }
            }
        }
        length++;
    }
    public void displayTree() {
        ArrayList<ArrayList<Integer>> tree = levelOrderBinaryTreeTraversal(root);

        for (ArrayList<Integer> level : tree) {
            for (Integer val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public void displayUpdatedTree() {
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(0);

        addAllGreaterKeys(root, sum);

        displayTree();
    }

    private void addAllGreaterKeys(Node root, ArrayList<Integer> sum) {
        if (root == null)
            {
                return;
            }
        
        addAllGreaterKeys(root.getRight(), sum);
        
        sum.set(0, sum.get(0) + root.getValue());
        root.setVal(sum.get(0));
        addAllGreaterKeys(root.getLeft(), sum);
    }

    public ArrayList<ArrayList<Integer>> levelOrderBinaryTreeTraversal(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        ArrayList<ArrayList<Integer>> levels = new ArrayList<ArrayList<Integer>>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<Integer>();

            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                level.add(node.getValue());

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            levels.add(level);
        }

        return levels;
    }

    private class Node {
        private Integer value;
        private Node left;
        private Node right;

        Node(Integer val) {
            this(val, null, null);
        }

        Node(Integer value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public void setVal(Integer value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Integer getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
}
