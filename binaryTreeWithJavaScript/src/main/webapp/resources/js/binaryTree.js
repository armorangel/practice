function Tree() {
	this.root;
}

Tree.prototype.addNode = function(value) {
	console.log(value);
	var newNode = new Node();
	newNode.setValue(value);

	if (this.root == null) {
		newNode.x = width / 2;
		newNode.y = 16;
		this.root = newNode;
		return;
	}

	var focusNode = this.root;
	while (true) {
		if (focusNode.getValue() >= value) {
			if (focusNode.getLeft() == null) {
				newNode.x = focusNode.x - 50;
				newNode.y = focusNode.y + 30;
				focusNode.setLeft(newNode);
				return;
			} else {
				focusNode = focusNode.getLeft();
			}
		} else {
			if (focusNode.getRight() == null) {
				newNode.x = focusNode.x + 50;
				newNode.y = focusNode.y + 30;
				focusNode.setRight(newNode);
				return;
			} else {
				focusNode = focusNode.getRight();
			}
		}
	}
}

Tree.prototype.getRoot = function() {
	console.log(this.root);
}

Tree.prototype.preOrder = function(root) { // DLR
	if (root != null) {
		console.log(root.getValue());
		this.preOrder(root.getLeft());
		this.preOrder(root.getRight());
	}
}

Tree.prototype.inOrder = function(root) { // LDR
	if (root != null) {
		this.inOrder(root.getLeft());
		//console.log(root.getValue());
		if(root.getLeft() != null){
			stroke(255);
			line(root.x, root.y, root.getLeft().x, root.getLeft().y);
		}
		
		fill(255);
		noStroke();
		textAlign(CENTER);
		text(root.getValue(), root.x, root.y)
		stroke(255);
		noFill();
		ellipse(root.x, root.y, 20, 20);
		
		this.inOrder(root.getRight());
		
		if(root.getRight() != null){
			stroke(255);
			line(root.x, root.y, root.getRight().x, root.getRight().y);
		}

	}
}

Tree.prototype.postOrder = function(root) { // LDR
	if (root != null) {
		this.inOrder(root.getLeft());
		this.inOrder(root.getRight());
		console.log(root.getValue());
	}
}
