public class BinaryTreeRecursiveDelete {
    static Node root;
	/**
	 * @param args
	 */
    public static void Delete(Node node){
    	if(node == null)
    		return;
    	Delete(node.left);
    	Delete(node.right);
        System.out.println("Deleted item is " + node.val);
        node = null;
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
