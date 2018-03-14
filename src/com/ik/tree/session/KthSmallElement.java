package com.ik.tree.session;

public class KthSmallElement {
	
	public int kthSmallest(TreeNode root, int k) {
		
		return 0;
	}
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
	
}


/*
 * 
 * Kth Smallest Element Of BST

 
Problem Statement:
 
Given a BST (binary search tree) of size N containing integer elements and an integer k. You have to find kth smallest element of given BST.
 
Input Format:
 
There are two arguments in the input. First one is the root of the BST and second one is an integer k.
 
Output Format:
 
Return an integer denoting kth smallest element of BST.
 
Constraints:
 
1 <= N <= 6000
1 <= k <= N
-2 * 10^9 <= value stored in any node <= 2 * 10^9
BST need not to be balanced.
You are not allowed to alter the structure or data inside the given BST. 
 
Sample Test Case:
 
Sample Input:
 
BST =
2 is the root node.
1 is 2's left child.
3 is 2's right child. 
 
k = 3
 
Sample Output:
 
3
 
Explanation:
 
3rd smallest element is 3.
 
Notes:
 
Maximum time allowed in interview: 20 Minutes. 
 */
