package binaryTree;

public class Node {

	private Node left;
	private Node right;

	private int value;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node(" + value + ") [L:: " + getLeft() + ", R:: " + getRight() + "]";
	}

}
