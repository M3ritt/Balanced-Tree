public class Node {

	public int numberOfNodes;  
	public String key[];        // the array that holds the keys value.
	public Node children[];  
	public boolean isLeaf;  

	public Node() {
		key = new String[3];   // The node can have at most 3 keys, easy change
		children = new Node[4];       // We have 4 references for each node, easy change
		isLeaf = true; 
	}
	
	@Override
	public String toString() {
		return "KEY1: "+this.key[0] + " KEY2: "+this.key[1] + " KEY3: "+this.key[2];
	}
}