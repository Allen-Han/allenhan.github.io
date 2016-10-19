package com.han.sort;

public class TestSort {

	public static void main(String[] args){
		 int[] array = {12,76,35,22,16,48,90,46,9,40};
		 BinaryTree root = new BinaryTree(array[0]);   //创建二叉树
		  for(int i=1;i<array.length;i++){
		   root.insertTree(root, array[i]);       //向二叉树中插入数据
		  }
		  System.out.println("先根遍历：");
		  BinaryTree.preOrder(root);
		  System.out.println();
		  System.out.println("中根遍历：");
		  BinaryTree.inOrder(root);
		  System.out.println();
		  System.out.println("后根遍历：");
		  BinaryTree.postOrder(root);
		  System.out.println();
		  System.out.println("层次遍历：");
		  BinaryTree.levelOrder(root);
	}
}
