/**
 * Student Name: Marcelo Gheiler
 * Filename: BinarySearchTree
 * Date: 3/15/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public class BinarySearchTree<T extends Comparable<T>> implements BST<T> {

	private MyTreeNode root;

	public BinarySearchTree() {
		root = new MyTreeNode();
	}

	@Override
	public void insert(T x) {
		if (root.data == null) {
			root.data = x;
		} else {
			root.insert(x);
		}
	}

	public void insertRec(MyTreeNode<T> node, T x) {
		if (node == null) {
			node = new MyTreeNode<>();
			node.data = x;
		} else {
			if (node.data.compareTo(x) > 0) {
				insertRec(node.leftChild, x);
			} else if (node.data.compareTo(x) < 0) {
				insertRec(node.rightChild, x);
			}
		}
	}

	@Override
	public void delete(T x) {

	}

	@Override
	public boolean lookup(T x) {
		return false;
	}

	@Override
	public void printPreOrder() {

	}

	@Override
	public void printInOrder() {
		if (root != null) {
			System.out.println(root.data);
			if (root.leftChild != null) {
				printInOrderRec(root.leftChild);
				System.out.println(root.leftChild.data);
			} else if (root.rightChild != null) {
				printInOrderRec(root.rightChild);
				System.out.println(root.rightChild);
			}
		}
	}

	public void printInOrderRec(MyTreeNode<T> node) {
		if (node.leftChild != null) {
			printInOrderRec(node.leftChild);
			System.out.println(node.leftChild.data);
		} else if (node.rightChild != null) {
			printInOrderRec(node.rightChild);
			System.out.println(node.rightChild);
		}
	}

	@Override
	public void printPostOrder() {

	}
}
