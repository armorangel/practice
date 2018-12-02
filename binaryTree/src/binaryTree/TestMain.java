package binaryTree;

public class TestMain {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.addNode(3);
		tree.addNode(2);
		tree.addNode(5);
		tree.addNode(7);
		tree.addNode(1);
		
		tree.getRoot();
		
		tree.preOrder(tree.getRoot());
		System.out.println();
		tree.inOrder(tree.getRoot());
		System.out.println();
		tree.postOrder(tree.getRoot());
		
		
		
		
	}
}
