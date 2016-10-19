package com.han.sort;

import java.util.LinkedList;

public class BinaryTree {

	int val;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int data) {
		this.val = data;
		left = null;
		right = null;
	}

	/**
	 * 二叉树插入
	 * 
	 * @param tree
	 * @param data
	 */
	public void insertTree(BinaryTree tree, int data) {
		if (data > tree.val) {
			if (tree.right != null) {
				insertTree(tree.right, data);
			} else {
				tree.right = new BinaryTree(data);
			}
		} else {
			if (tree.left != null) {
				insertTree(tree.left, data);
			} else {
				tree.left = new BinaryTree(data);
			}
		}
	}
	
	public static void preOrder(BinaryTree tree){
		if(tree!=null){
			System.out.print(tree.val+"-");
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}
	
	public static void inOrder(BinaryTree tree){
		if(tree!=null){
			inOrder(tree.left);
			System.out.print(tree.val+"-");
			inOrder(tree.right);
		}
	}
	
	public static void postOrder(BinaryTree tree){
		if(tree!=null){
			postOrder(tree.left);
			postOrder(tree.right);
			System.out.print(tree.val+"-");
		}
	}
	

	/**
	 * 二叉树层次遍历
	 * 
	 * @param tree
	 */
	public static void levelOrder(BinaryTree tree) {
		if (tree != null) {
			LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
			queue.offer(tree);
			while(!queue.isEmpty()){
				BinaryTree current = queue.poll(); 
				System.out.print(current.val+"-");
				if(current.left!=null){
					queue.offer(current.left);
				}
				if(current.right!=null){
					queue.offer(current.right);
				}
			}
		}
	}
}
