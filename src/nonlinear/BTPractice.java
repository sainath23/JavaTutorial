package nonlinear;

import java.util.Scanner;

public class BTPractice {
	
	public BTNode insert(BTNode root, int data) {
		if(root == null) {
			return new BTNode(data);
		}
		else {
			BTNode current;
			if(data <= root.data) {
				current = insert(root.left, data);
				root.left = current;
			}
			else {
				current = insert(root.right, data);
				root.right = current;
			}
			
			return root;
		}
	}
	
	public int getHeight(BTNode root) {
		if(root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		else {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}
	}
	
	public int countNodes(BTNode root) {
		if(root == null) {
			return 0;
		}
		else {
			int count = 1;
			count = count+countNodes(root.left);
			count = count+countNodes(root.right);
			return count;
		}
	}
	
	public boolean searchNode(BTNode root, int data) {
		if(root.data == data) {
			return true;
		}
		if(root.left != null) {
			if(searchNode(root.left, data))
				return true;
		}
		if(root.right != null) {
			if(searchNode(root.right, data))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		BTPractice bt = new BTPractice();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BTNode root = null;
		
		while(n-- > 0) {
			int data = sc.nextInt();
			root = bt.insert(root, data);
		}
		int height = bt.getHeight(root);
		System.out.println("Height of this Binary Tree is: "+height);
		System.out.println("Total Nodes: "+bt.countNodes(root));
		bt.insert(root, 70);
		System.out.println("Height after inserting 70: "+bt.getHeight(root));
		System.out.println("Total Nodes: "+bt.countNodes(root));
		System.out.println("Search node 80: "+bt.searchNode(root, 80));
	}
}
