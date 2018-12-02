package binaryTree;

public class Tree {

	private Node root;

	public Tree() {
	}

	public void addNode(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		if (root == null) { // 루트 검사
			root = newNode;
			return;
		}
		Node focusNode = root;
		while (true) {

			if (focusNode.getValue() > value) {
				if (focusNode.getLeft() == null) {
					focusNode.setLeft(newNode);
					return;
				} else
					focusNode = focusNode.getLeft();
			} else {
				if (focusNode.getRight() == null) {
					focusNode.setRight(newNode);
					return;
				} else
					focusNode = focusNode.getRight();
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.getValue() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			preOrder(root.getLeft());
			System.out.print(root.getValue() + " ");
			preOrder(root.getRight());
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			preOrder(root.getLeft());
			preOrder(root.getRight());
			System.out.print(root.getValue() + " ");
		}
	}
}
