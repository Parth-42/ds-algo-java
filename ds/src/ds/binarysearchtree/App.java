package ds.binarysearchtree;

public class App {

	public static void main(String[] args) {

		BST tree = new BST();
		
		tree.insert(15, "Fifteen");
		tree.insert(20, "Twenty");
		tree.insert(10, "Ten");
		tree.insert(32, "ThirtyTwo");
		tree.insert(5, "Five");
		tree.insert(22, "TwentyTwo");
		
		
//		System.out.println(tree.findMin().key);
//		System.out.println(tree.findMax().key);
//		
//		System.out.println(tree.remove(10));
//		System.out.println(tree.findMin().key);
		
		tree.displayTree();
		
	}

}
