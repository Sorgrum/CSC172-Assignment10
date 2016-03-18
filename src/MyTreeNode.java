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

	public void printInOrder() {
		System.out.println();
	}
}