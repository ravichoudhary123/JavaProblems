import java.util.Stack;

public class InorderTraversalNoRecursion {
	Node root;
	
	void inordertraverse(Node node){
		Stack<Node> stack = new Stack<Node>();
		Node temp;
		if(node == null){
			//System.out.println(node.val);
		}
		else{
			stack.push(node);
			while(!stack.isEmpty()){
				if(node.left != null){
					stack.push(node.left);
					node = node.left;
				}
				else{
					temp = stack.pop();
					System.out.println(temp.val);
					if(temp.right != null)
					{
						node = temp;
						node = node.right;
						stack.push(node);
					}
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderTraversalNoRecursion itbt = new InorderTraversalNoRecursion();
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
