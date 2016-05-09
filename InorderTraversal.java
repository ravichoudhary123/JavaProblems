
public class InorderTraversal {
	Node root;
	
	@SuppressWarnings("null")
	void inordertraverse(Node node){
		if(node == null){
			//System.out.println(node.val);
		}
		else{
			//process left
			if(node.left != null){
				inordertraverse(node.left);
			}
			System.out.println(node.val);
			//process right subtree
			if(node.right != null){
				inordertraverse(node.right);
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderTraversal itbt = new InorderTraversal();
		itbt.root = new Node(10);
		itbt.root.left = new Node(5);
		itbt.root.right = new Node(18);
		itbt.root.left.left = new Node(4);
		itbt.root.left.right = new Node(8);
		itbt.root.left.right.left = new Node(7);
		itbt.root.right.left = new Node(15);
		itbt.root.right.right = new Node(20);
		itbt.inordertraverse(itbt.root);
		return;
	}

}
