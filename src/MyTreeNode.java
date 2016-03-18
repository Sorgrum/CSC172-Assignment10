/**
 * Student Name: Marcelo Gheiler
 * Filename: MyTreeNode
 * Date: 3/15/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public class MyTreeNode<T extends Comparable<T>> {

	public T data;
	public MyTreeNode<T> leftChild;
	public MyTreeNode<T> rightChild;
	public MyTreeNode<T> parent;

	public void insert(T x) {
		if (x.compareTo(this.data) < 0) {
			if (this.leftChild == null) {
				MyTreeNode<T> newNode = new MyTreeNode<>();
				newNode.data = x;
				newNode.parent = this;
				this.leftChild = newNode;
			} else {
				this.leftChild.insert(x);
			}
		} else if (x.compareTo(this.data) == 0) {

		} else if (x.compareTo(this.data) > 0) {
			if (this.rightChild == null) {
				MyTreeNode<T> newNode = new MyTreeNode<>();
				newNode.data = x;
				newNode.parent = this;
				this.rightChild = newNode;
			} else {
				this.rightChild.insert(x);
			}
		}
	}

	public void delete(T x) {
		if (this.data == x) {
			// If the node is a leaf
			if (this.leftChild == null && this.rightChild == null) {
				this.parent = null;
			} else if ((this.leftChild == null && this.rightChild != null) || (this.leftChild != null && this.rightChild == null)) {

			}
		}
		// Traverse the tree until you find the data
		else {
			if (x.compareTo(this.data) < 0) {
				if (this.leftChild != null) {
					this.leftChild.delete(x);
				}
			} else {
				if (this.rightChild != null) {
					this.rightChild.delete(x);
				}
			}
		}
	}

	public boolean lookup(T x) {

		if (this.data == x) {
			return true;
		} else {
			if (x.compareTo(this.data) < 0) {
				if (this.leftChild != null) {
					return this.leftChild.lookup(x);
				} else {
					return false;
				}
			} else {
				if (this.rightChild != null) {
					return this.rightChild.lookup(x);
				} else {
					return false;
				}
			}
		}

	}

	public void printInOrder() {
		if (this.leftChild != null) {
			this.leftChild.printInOrder();
		}
		System.out.println(this.data);
		if (this.rightChild != null) {
			this.rightChild.printInOrder();
		}
	}

	public void printPreOrder() {
		System.out.println(this.data);
		if (this.leftChild != null) {
			this.leftChild.printPreOrder();
		}
		if (this.rightChild != null) {
			this.rightChild.printPreOrder();
		}
	}

	public void printPostOrder() {
		if (this.leftChild != null) {
			this.leftChild.printPostOrder();
		}
		if (this.rightChild != null) {
			this.rightChild.printPostOrder();
		}
		System.out.println(this.data);
	}
}