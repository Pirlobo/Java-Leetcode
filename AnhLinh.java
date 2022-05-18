

public class AnhLinh
{
    
	Node root;

	// A utility function to check if a given node is leaf or not
	static boolean isLeaf(Node node)
	{
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}

	// This function returns sum of all left leaves in a given
	// binary tree
	static private int leftLeavesSum(Node node)
	{
		// Initialize result
		int res = 0;

		// Update result if root is not NULL
		if (node != null)
		{
			// If left of root is NULL, then add key of
			// left child
            //  1
            // 2 3
            //4
			if (isLeaf(node.left))
				res += node.left.data;
			else // Else recur for left child of root
				res += leftLeavesSum(node.left);

			// Recur for right child of root and update res
			res += leftLeavesSum(node.right);
		}

		// return result
		return res;
	}

	// Driver program
	public static void main(String args[])
	{
		AnhLinh tree = new AnhLinh();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);


		System.out.println("The sum of leaves is " +
									tree.leftLeavesSum(tree.root));
	}
}

// Java program to find sum of all left leaves
class Node
{
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right = null;
	}
}

// This code is contributed by Mayank Jaiswal
