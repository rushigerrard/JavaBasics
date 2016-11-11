package com.learning.java.tree;

/* Definition for a binary tree node.*/
 public class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	 public TreeNode(int val){ 
		 this.val = val; 
		 left = right = null;
	 }

	/*public boolean remove(int val2, TreeNode auxRoot) {
		
		return false;
	}*/
	 
	public int minVal() {

         if (left == null)

               return val;

         else

               return left.minVal();

   }

	
	public boolean remove(int val, TreeNode parent) {
		System.out.println("Looking to remove"+val);
		if (val < this.val) {

			if (left != null)

				return left.remove(val, this);

			else

				return false;

		} else if (val > this.val) {

			if (right != null)

				return right.remove(val, this);

			else

				return false;

		} else {

			if (left != null && right != null) {

				this.val = right.minVal();
				System.out.println("replaced" + this.val);
				right.remove(this.val, this);

			} /*else if (parent.left == this) {

				parent.left = (left != null) ? left : right;

			} else if (parent.right == this) {

				parent.right = (left != null) ? left : right;

			}*/
			else if (parent.left == this) {
				if (this.right != null)
					parent.left =this.right;
				else
					parent.left = null;
			} else if (parent.right == this) {
				if(this.right != null)
					parent.right = this.right;
				else
					parent.right = null;
			}
				
			return true;

		}

	}
 }
 