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

	@Override
	public void delete(T x) {
		if (lookup(x)){
			if (root != null) {
				root.delete(x);
			}
		}
	}

	@Override
	public boolean lookup(T x) {

		if (root == null) {
			return false;
		} else {

			return root.lookup(x);
		}
	}

	@Override
	public void printPreOrder() {
		if (root != null) {
			root.printPreOrder();
		}
	}

	@Override
	public void printInOrder() {
		if (root != null) {
			root.printInOrder();
		}
	}


	@Override
	public void printPostOrder() {
		if (root != null) {
			root.printPostOrder();
		}
	}
}
