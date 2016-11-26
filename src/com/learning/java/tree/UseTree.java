package com.learning.java.tree;

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
		System.out.println("Lowest common ancestor of 6, 8 is " + t.lowestCommonAncestor(6, 8));
		System.out.println("--------------------");
		System.out.println("Size is " + t.size());
		//t.topView();
	}

}
