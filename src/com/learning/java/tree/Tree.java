package com.learning.java.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
	
	private TreeNode root;
	private int size;
	
	public Tree(){
		root = null;
		size = 0;
	}
	
	private TreeNode _insert(TreeNode root, int val) {
		if(root == null){
			root = new TreeNode(val);
			size = size + 1;
		}
		else{
			if(val < root.val){
				root.left = _insert(root.left, val);
			}
			else{
				root.right = _insert(root.right, val);
			}
		}
		
		return root;
		
	}
	
	public void insert(int val){
		root = _insert(root, val);
	}
	
	/*public void remove(int val){
		//2 steps
		//Step 1 : Reaching that node
		TreeNode findNode = findNode(root, val);
		if(findNode == null)
			System.out.println("Node not found");
		
		//Step 2, removing it in some way
		if(findNode.left == null && findNode.right == null){
			findNode = null;
		}
	}*/
	
	public void inorder() {
		_inorder(root);
	}
	
	private void _inorder(TreeNode node){
		if(node == null)
			return;
		_inorder(node.left);
		System.out.println(node.val);
		_inorder(node.right);
	}
	
	public void preorder(){
		_preorder(root);
	}
	
	private void _preorder(TreeNode node) {
		if(node == null)
			return ;
		System.out.println(node.val);
		_preorder(node.left);
		_preorder(node.right);
	}

	public void postorder(){
		_postorder(root);
	}
	private void _postorder(TreeNode node) {
		if(node == null)
			return ;
		_postorder(node.left);
		_postorder(node.right);
		System.out.println(node.val);
		
	}

	public void topView(){
		_topView(root);
		
	}

	private void _topView(TreeNode node) {
		if(node == null)
			return ;
		//start with left most
		_topViewLeft(node.left);
		
		System.out.println(node.val);
		
		//proceed to right
		_topViewRight(node.right);
	}

	private void _topViewRight(TreeNode node) {
		if(node == null)
			return ;
		//continue moving right
		System.out.println(node.val);
		_topViewRight(node.right);
	}

	private void _topViewLeft(TreeNode node) {
		if(node == null)
			return ;
		//continue moving left
		_topViewLeft(node.left);
		System.out.println(node.val);
		
		
	}

	public int size() {
		return size;
	}

	public void leftView() {
		leftView(root);
		
	}
	
	public void rightView(){
		rightView(root);
	}

	
	private void rightView(TreeNode root) {
		
		Queue<TreeNode> currentQueue = new LinkedList<>();
		ArrayList<Queue<TreeNode>> all = new ArrayList<>();
		currentQueue.add(root);
		all.add(new LinkedList(currentQueue));
		
		boolean travelFlag  = true;
		while(travelFlag){
			Queue<TreeNode> newQueue = new LinkedList<>();
			while(!currentQueue.isEmpty()){
				TreeNode queuedNode = currentQueue.poll();
				if(queuedNode.right != null)
					newQueue.add(queuedNode.right);
				if(queuedNode.left != null)
					newQueue.add(queuedNode.left);
			}
			if(newQueue.isEmpty()){
				travelFlag = false;
			}
			else{
				all.add(new LinkedList(newQueue));
				currentQueue = new LinkedList(newQueue);
			}
		}
		System.out.println("Right view is : ");
		for(Queue<TreeNode> q : all) {
			System.out.println(q.poll().val);
		}
	}
	
	private void leftView(TreeNode node) {
		// TODO Auto-generated method stub
		ArrayList<Queue<TreeNode>> allQueue = new ArrayList<>();
		Queue<TreeNode> currentList = new LinkedList<TreeNode>();
		Queue<TreeNode> list = null;
		currentList.add(node);		
		allQueue.add(new LinkedList(currentList));		
		while (currentList != null) {			
			list = new LinkedList<TreeNode>();
			while (!currentList.isEmpty()) {
				TreeNode n = currentList.poll();
				if (n.left != null)
					list.add(n.left);
				if (n.right != null)
					list.add(n.right);				
			}			
			if (list.isEmpty())
				currentList = null;
			else {
				currentList = list;
				allQueue.add(new LinkedList(list));
			}
		}
		System.out.println("Left view is.....");
		for(Queue<TreeNode> q : allQueue) {
			System.out.println(q.poll().val);
		}
	}

	public void bfs() {
		bfs(root);
	}

	private void bfs(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		System.out.println(root.val);
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode tn = queue.poll();
			if(tn.left != null){
				System.out.println(tn.left.val);
				queue.add(tn.left);
			}
			if(tn.right != null){
				System.out.println(tn.right.val);
				queue.add(tn.right);
			}
		}
		
	}

	

	private TreeNode findNode(TreeNode root, int val) {
		if(root == null){
			return null;
		}
		TreeNode found = null;
		if(root.val == val){
			return root;
		}
		if(root.val > val){
			found = findNode(root.left, val);
		}
		else{
			found = findNode(root.right, val);
		}
		return found;	
	}

	private Integer leftMostOnRight(TreeNode node) {
		int val = node.val;
		if(node.left != null){
			val = leftMostOnRight(node.left);
		}
		return val;
	}
	
	public void replacingNode(int val) {
		TreeNode current = findNode(root, val);
		Integer replace = -1;
		if(current.right != null){
			replace = leftMostOnRight(current.right);
		}
		System.out.println("Replacing value will be " + replace);
	}
	
	public boolean remove(int val) {
		boolean result = false;
		if (root == null)
			return result;
		else {
			if (root.val == val) {
				TreeNode auxRoot = new TreeNode(0);
				auxRoot.left = root;
				result = root.remove(val, auxRoot);
				root = auxRoot.left;
			} else {

				result =  root.remove(val, null);

			}

		}
		return result;

	}
	
	
	public TreeNode invertTree() {
		root = invertTree(root);
		return root;
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null)
			return root;
		TreeNode tmp;
		tmp = root.left;
		
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		else if(( p == null && q != null) || 
				(p != null && q == null) ||
				(p.val != q.val))
			return false;
		else 
			return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	}
	
	public int lowestCommonAncestor(int p, int q) {
		TreeNode ancestor = lowestCommonAncestor(root, new TreeNode(p),new TreeNode(q));
        if(ancestor == null)
        	return -1;
        return ancestor.val; 
    }
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root.val == p.val || root.val == q.val || (root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val) )
			return root;
		else if(p.val < root.val)
			return lowestCommonAncestor(root.left, p, q);
		else if(p.val > root.val)
			return lowestCommonAncestor(root.right, p, q);
		
		return root;
    }
	
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> finalList = new ArrayList<>();
		
		if(root == null)
			return finalList;
		ArrayList<Queue<TreeNode>> allQueue = new ArrayList<>();
		Queue<TreeNode> currentList = new LinkedList<TreeNode>();
		Queue<TreeNode> list = null;
		currentList.add(root);		
		allQueue.add(new LinkedList(currentList));		
		while (currentList != null) {			
			list = new LinkedList<TreeNode>();
			while (!currentList.isEmpty()) {
				TreeNode n = currentList.poll();
				if (n.left != null)
					list.add(n.left);
				if (n.right != null)
					list.add(n.right);				
			}			
			if (list.isEmpty())
		 		currentList = null;
			else {
				currentList = list;
				allQueue.add(new LinkedList(list));
			}
		}
//		Collections.reverse(allQueue);
		
		for(Queue<TreeNode> q : allQueue){
			List<Integer> newList = new ArrayList<>();
			while(!q.isEmpty()){
				newList.add(new Integer(q.poll().val));
			}
			finalList.add(new ArrayList(newList));
		}
		return finalList;
	}
	
	public boolean isSymmetric(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		else if(( p == null && q != null) || 
				(p != null && q == null) ||
				(p.val != q.val))
			return false;
		else 
			return (isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left));
	}
	public boolean isSymmetric(TreeNode root) {
		
		if(root == null)
			return true;
		

		return isSymmetric(root.left, root.right);
		
    }
	public int max(int a, int b){
        if(a > b)
            return a;
        return b;    
    }
	
	public int checkHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + max( checkHeight(root.left), checkHeight(root.right) );
    }
    
    public boolean isBalanced(TreeNode root) {
        boolean flag = false;
    	if(root == null)
            return true;
        
        if( (Math.abs (checkHeight(root.left) - checkHeight(root.right))) > 1){
            return false;
        }
        
        return ( isBalanced(root.left) && isBalanced(root.right) );
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
		return null;
        
    }
}