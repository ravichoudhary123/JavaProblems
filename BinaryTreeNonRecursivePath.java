/*import java.util.Stack;;

public class BinaryTreeNonRecursivePath {
    Node root;
	/**
	 * @param args
	 *//*
    public void traverse(){
    	Stack<Node> stack = new Stack<Node>();
        if(root == null)
        	return;
    	stack.push(root);
    	System.out.println(root.val);
    	Node temp = root;
    	while(!stack.isEmpty()){
    		if(temp.left!=null){
    			stack.push(temp.left);
    			System.out.println(temp.left.val);
    		    temp = temp.left;
    		}
    		else{
    			temp = stack.pop();
    			if((temp.right != null) || (temp.left!=null)){
    				stack.push(temp.right);
    				System.out.println(temp.right.val);
    				temp = temp.right;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		BinaryTreeNonRecursivePath btree = new BinaryTreeNonRecursivePath();
		// TODO Auto-generated method stub
		btree.root = new Node(6);
		btree.root.left = new Node(3);
		btree.root.right = new Node(5);
		btree.root.left.left = new Node(2);
		btree.root.left.right = new Node(5);
		btree.root.right.right = new Node(4);
		btree.root.left.right.left = new Node(7);
		btree.root.left.right.right = new Node(4);
		btree.traverse();
		return;
	}

}
*/
import java.util.*;
 
class BinaryTreeNonRecursivePath {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		printRoot(root);
 
	}
 
	private static void printRoot(Node root) {
		// TODO Auto-generated method stub
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		String display = "";
		while (true)	{
			if (current != null)	{
				display = display + current.val + " ";
				if (current.right != null)
						stack.push(current);
				if (current.left == null && current.right == null)
					System.out.println(display);
				current = current.left;
			}
 
			else if ( !stack.isEmpty()) {
				current = stack.pop();
				//System.out.println(display);
				int index = display.indexOf("" + current.val);
				display = display.substring(0, index + ("" + current.val).length() + 1);
				current = current.right;
			}
 
			else 	{
				break;
			}
		}
 
	}
 
	private static Node createTree() {
		// TODO Auto-generated method stub
 
		Node root = new Node(10);
	    root.left = new Node(8);
	    root.right = new Node(2);
	    root.left.left = new Node(3);
	    root.left.right = new Node(5);
	    root.right.left = new Node(2);
		/*Node root = new Node(6);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(5);
		root.left.right.left = new Node(7);
		root.left.right.right = new Node(4);
		root.right = new Node(5);
		root.right.right = new Node(4);*/
		return root;
	}
 
}