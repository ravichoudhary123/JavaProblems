import java.util.LinkedList;
import java.util.Queue;

class Node{
	int val;
	Node left;
	Node right;
    
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
//Balanced Binary Tree, height should not be disturbed
public class BinaryTree {
	Node root;
	boolean remove;
	Node new_focus;
	Queue<Node> queue = new LinkedList<Node>();
	public void AddItem(int item)
	{
		Node new_node = new Node(item);
		
		//first node in the btree, make it root
		if(root == null)
		{
			root = new_node;
			queue.add(root);
		}
		else
		{			
			// Set root as the Node we will start
            // with as we traverse the tree
			//pop item
			if(!remove){
				new_focus = queue.remove();
			}
            
            // Future parent for our new Node
            Node parent;
            
            parent = new_focus;
            if(parent.left == null)
            {
    			parent.left = new_node;
    			queue.add(new_node);
    			remove = true;
            }
            else if(parent.right == null)
    		{
            	parent.right = new_node;
            	queue.add(new_node);
            	remove = false;
    		}
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree btree = new BinaryTree();
		btree.AddItem(1);
		btree.AddItem(2);
		btree.AddItem(3);
		btree.AddItem(4);
		btree.AddItem(5);
		btree.AddItem(6);
		btree.AddItem(7);
		btree.AddItem(8);
	}
	
	public BinaryTree()
    {
        root = null;
        remove = false;
    }

}