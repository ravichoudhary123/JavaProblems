import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNonRecursiveDelete {
    static Node root;
	/**
	 * @param args
	 */
    public static void Delete(Node root){
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(root);
    	while(!queue.isEmpty()){
    		Node temp = queue.remove();
    		if(temp.left != null)
    			queue.add(temp.left);
    		if(temp.right != null)
    			queue.add(temp.right);
    		temp = null;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(6);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.left = new Node(9);
		root.right.right = new Node(10);
		Delete(root);
		root = null;
		return;
	}

}
