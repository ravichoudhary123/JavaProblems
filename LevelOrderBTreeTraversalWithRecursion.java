public class LevelOrderBTreeTraversalWithRecursion {
    Node root;
	/**
	 * @param args
	 */
    public int height(Node node){
    	int height;
    	if(node == null){
    		return 0;
    	}
    	int heightleft = height(node.left);
    	int heightright = height(node.left);
    	if(heightleft > heightright)
    		height = heightleft + 1;
    	else
    		height = heightright + 1;
    	return height;
    }
    
    public void traverseatlevel(Node node, int level)
    {
    	if(node == null)
    		return;
    	if (level == 1)
            System.out.print(node.val + " ");
        else if (level > 1)
        {
	    	traverseatlevel(node.left, level - 1);
	    	traverseatlevel(node.right, level - 1);
        }
    }
    
    public void traverse(){
    	int height = height(root);
    	for(int i = 1; i<=height; i++)
    		traverseatlevel(root, i);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderBTreeTraversalWithRecursion btree = new LevelOrderBTreeTraversalWithRecursion();
		btree.root = new Node(4);
		btree.root.left = new Node(5);
		btree.root.right = new Node(6);
		btree.root.left.left = new Node(7);
		btree.root.left.right = new Node(8);
		btree.root.right.left = new Node(9);
		btree.root.right.right = new Node(10);
		btree.traverse();
		btree.root = null;
		return;
	}

}
