public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
	    tree.insert(5);
	    tree.insert(4);
	    tree.insert(6);
	    tree.printInOrder();
    }
}
