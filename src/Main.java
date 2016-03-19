public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
	    tree.insert(5);
	    tree.insert(4);
	    tree.insert(6);
		tree.insert(3);
		tree.insert(2);
		tree.insert(7);
		System.out.println("In order");
		tree.printInOrder();
		System.out.println("Pre order");
		tree.printPreOrder();
		System.out.println("post order");
		tree.printPostOrder();
		System.out.println(tree);
		System.out.println(tree.lookup(3));
		System.out.println(tree.lookup(5));
		System.out.println(tree.lookup(4));
		System.out.println(tree.lookup(100));
	    tree.delete(3);
	    tree.delete(2);
	    tree.printInOrder();
	}
}
