package xxsurajbxx.DataStructures;
public class BinaryTree {
	private class Node {
		public Node Cright;
		public Node parent;
		public int value;
		public Node(int value) {
			this.parent = null;
		}
		public Node(Node parent, int value) {
			this.parent = parent;
			this.value = value;
			this.Cleft = this.Cright = null;
		}
	public BinaryTree(int value) {
		root = new Node(value);
	}
	public void addNode(int val) {
		if(val<root.value) {
			if(root.Cleft==null) {
				root.Cleft=new Node(root, val);
			}
			else {
				addNode(root.Cleft, val);
			}
		}
		else if(val>root.value) {
			if(root.Cright==null) {
				root.Cright=new Node(root, val);
			}
			else {
				addNode(root.Cright, val);
			}
		}
	}
	private void addNode(Node parent, int val) {
		if(val<parent.value) {
			if(parent.Cleft==null) {
				parent.Cleft=new Node(parent, val);
			}
			else {
				addNode(parent.Cleft, val);
			}
		}
		else if(val>parent.value) {
			if(parent.Cright==null) {
				parent.Cright=new Node(parent, val);
			}
			else {
				addNode(parent.Cright, val);
			}
		}
}