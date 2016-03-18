/**
 * Student Name: Marcelo Gheiler
 * Filename: BST
 * Date: 3/15/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public interface BST<T extends Comparable<T>> {
	public void insert(T x);
	public void delete(T x);
	public boolean lookup(T x);
	public void printPreOrder();
	public void printInOrder();
	public void printPostOrder();
}