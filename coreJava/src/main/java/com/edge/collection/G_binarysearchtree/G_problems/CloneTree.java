package com.edge.collection.G_binarysearchtree.G_problems;

public class CloneTree {

	public static void main(String[] args) {
		// create a treenode insert few values( methods not implemented here) and then
		// call the clonetree method on the treenode object

	}

}

/**
 * Definition of TreeNode:
 */
class TreeNode {
	public int val;
	public TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}

class Solution {
	/**
	 * @param root: The root of binary tree
	 * @return root of new tree
	 */
	public TreeNode cloneTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode newNode = new TreeNode(root.val);
		newNode.left = cloneTree(root.left);
		newNode.right = cloneTree(root.right);
		return newNode;
	}
}