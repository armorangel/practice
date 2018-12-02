function Node() {
	this.left = null;
	this.right = null;
	
	this.x = null;
	this.y = null;

	this.value;
}

Node.prototype.setLeft = function(_left){
	this.left = _left;
}

Node.prototype.setRight = function(_right){
	this.right = _right;
}

Node.prototype.setValue = function(_value){
	this.value = _value;
}

Node.prototype.getLeft = function(){
	return this.left;
}

Node.prototype.getRight = function(){
	return this.right;
}

Node.prototype.getValue = function(){
	return this.value;
}