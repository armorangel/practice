function setup(){
	createCanvas(600, 400);
	background(51);
	
	var tree = new Tree();

	tree.addNode(4);
	tree.addNode(3);
	tree.addNode(1);
	tree.addNode(2);
	tree.addNode(5);
	tree.addNode(7);
	tree.addNode(6);

	tree.addNode(9);
	tree.addNode(8);

	//tree.getRoot();

	//tree.preOrder(tree.root);
	tree.inOrder(tree.root);
	//tree.postOrder(tree.root);
}

function draw(){
	
}