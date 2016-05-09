
public class BinaryTreetoDLL {
	Node root;
	Node bintree2listUtil(Node node) {
        if(node == null)
        	return node;
        
        //process left side
        if(node.left!=null){
        	Node left = bintree2listUtil(node.left);
        	for(;left.right!=null;left = left.right);
        	left.right = node;
        	node.left = left;
        }
        
        //process right side
        if(node.right != null)
        {
        	Node right = bintree2listUtil(node.right);
        	for(;right.left != null; right = right.left);
        	node.right = right;
        	right.left = node;
        }
 
        return node;
    }
	
	// The main function that first calls bintree2listUtil(), then follows step 3 
    //  of the above algorithm
    Node bintree2list(Node node) {
         
        // Base case
        if (node == null) {
            return node;
        }
 
        // Convert to DLL using bintree2listUtil()
        node = bintree2listUtil(node);
 
        // bintree2listUtil() returns root node of the converted
        // DLL.  We need pointer to the leftmost node which is
        // head of the constructed DLL, so move to the leftmost node
        while (node.left != null) {
            node = node.left;
        }
 
        return node;
    }
    
    void printdlist(Node node){
    	while(node != null)
    	{
    		System.out.println(node.val);
    		node = node.right;
    	}
    }
    
	public static void main(String string[]){
		BinaryTreetoDLL bdll = new BinaryTreetoDLL();
		bdll.root = new Node(10);
		bdll.root.left = new Node(12);
		bdll.root.left.left = new Node(25);
		bdll.root.left.right = new Node(30);
		bdll.root.right = new Node(15);
		bdll.root.right.left = new Node(36);
		Node head = bdll.bintree2list(bdll.root);
		bdll.printdlist(head);		
	}

}
