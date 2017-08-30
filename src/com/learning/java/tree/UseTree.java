package com.learning.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseTree {

	public static void main(String[] args) {
		Tree t = new Tree();
		t.insert(5);
		t.insert(3);
		t.insert(4);
		t.insert(1);
		t.insert(2);
		t.insert(7);		
		t.insert(6);
		t.insert(11);
		t.insert(9);
		t.insert(8);
		t.insert(10);
		System.out.println("--------------------");
		t.inorder();
		System.out.println("--------------------");
		t.preorder();
		System.out.println("--------------------");
		t.postorder();
		System.out.println("--------------------");
		t.topView();
		System.out.println("--------------------");
		t.leftView();
		System.out.println("--------------------");
		t.rightView();
		System.out.println("--------------------");
		t.bfs();
		System.out.println("--------------------");
		//System.out.println(t.remove(7));
		//System.out.println(t.remove());
		t.inorder();
		System.out.println("--------------------");
		t.preorder();
		System.out.println("--------------------");
		//t.invertTree();
		//t.invertTree();
		System.out.println("--------------------");
		t.inorder();
		System.out.println("--------------------");
		System.out.println("Lowest common ancestor of 1, 4 is " + t.lowestCommonAncestor(1, 4));
		System.out.println("--------------------");
		System.out.println("Size is " + t.size());
		//t.topView();
		Tree wellBalancedTree = new Tree();
		Integer[] givenArray = {0, 1, 2, 3, 4};
		wellBalancedTree.minimalHeight(givenArray);
		System.out.println("Inorder traversal of well balanced tree is : ");
		wellBalancedTree.inorder();
		System.out.println("Preorder traversal of well balanced tree is : ");
		wellBalancedTree.preorder();
		ArrayList<LinkedList<Integer>> results = wellBalancedTree.allSequences();
		System.out.println("All sequences of given tree are ");
		for(LinkedList<Integer> result : results){
			for (Integer value : result) {
				// System.out.print(value + " -> ");
			}
		//	System.out.println();
		}
		Tree testAllPaths = new Tree();
		testAllPaths.insert(7);
		testAllPaths.insert(5);
		testAllPaths.insert(6);
		testAllPaths.insert(4);
		testAllPaths.insert(9);
		testAllPaths.insert(8);
		testAllPaths.insert(10);

		

		 
		Tree printTree = new Tree();
		printTree.insert(8);
		printTree.insert(6);
		printTree.insert(7);
		printTree.insert(11);
		printTree.insert(10);


		int row = printTree.getHeight();
		int col = (int) (Math.pow(2, row) - 1);
		int[][] grid = new int[row][col];
		List<LinkedList<Integer>> allPaths = printTree.allPaths();
		for (LinkedList<Integer> path : allPaths) {
			for (Integer block : path) {
				System.out.print(block + " -> ");
			}
			System.out.println();
		}
		System.out.println(row + " " + col);
		Tree cbt = new Tree();
		int[] nums = new int[] { 3, 2, 1, 6, 0, 5 };
		cbt.constructMaximumBinaryTree(nums);

		Tree maxTree = new Tree();
		maxTree.insert(8);
		maxTree.insert(10);
		maxTree.insert(9);
		maxTree.insert(11);
		maxTree.insert(4);
		maxTree.insert(6);
		maxTree.insert(5);
		maxTree.insert(7);
		maxTree.insert(2);
		maxTree.insert(3);
		maxTree.insert(1);
		System.out.println("maxPathSum :" + maxTree.maxPathSum());
	}


}
