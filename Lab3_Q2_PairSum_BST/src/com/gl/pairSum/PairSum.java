package com.gl.pairSum;
import java.util.HashSet;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class PairSum {

	private static boolean findPair(TreeNode root, int targetSum, HashSet<Integer> set) {
		if (root == null) {
			return false;
		}

		if (findPair(root.left, targetSum, set)) {
			return true;
		}

		int complement = targetSum - root.val;
		if (set.contains(complement)) {
			System.out.println("The Pair of given sum is (" + complement + ", " + root.val + ")");
			return true;
		}

		set.add(root.val);

		return findPair(root.right, targetSum, set);
	}

	public static void findPair(TreeNode root, int targetSum) {
		HashSet<Integer> set = new HashSet<>();
		if (!findPair(root, targetSum, set)) {
			System.out.println("No pair found with the given sum.");
		}
	}

	public static void main(String[] args) {
		// Create the Binary Search Tree (BST)
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(60);
		root.right = new TreeNode(130);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(70);
		root.right.left = new TreeNode(120);
		root.right.right = new TreeNode(150);

		int sum = 130;

		// Find a pair with the given sum in the BST
		findPair(root, sum);
	}
}


