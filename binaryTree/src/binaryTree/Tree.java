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
			int height = newNode.getHeight() + 1;
			newNode.setHeight(height);
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

	public void getRoot() {
		System.out.println(root);
	}


}
