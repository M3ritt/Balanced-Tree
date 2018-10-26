public class Tree {

	public Node root;
	boolean found = false;
	int count = 0;
	String file = "";

	Tree() {
		root = new Node();
		root.isLeaf = true;
		root.numberOfNodes = 0;
		root.key[0] = "";
	}

	public void insert(String file){
		Node r = root;
		if (r.numberOfNodes == 3) {
			Node temp = new Node();
			root = temp;
			temp.numberOfNodes = 0;
			temp.isLeaf = false;
			temp.children[0] = r;

			splitChild(temp, 1, r);
			insertNonfull(temp, file);
		} else { //root is set to one after split
			insertNonfull(r, file);
		}
	}
	//helper for insert(file)
	public void insertNonfull(Node node, String value) {
		int i = node.numberOfNodes;
		boolean valueIsLessThanNodeKey = false;
		if(i >=1) {
			if(value.compareTo(node.key[i-1]) < 0)
				valueIsLessThanNodeKey = true;
		}
		if (node.isLeaf) {
			while (i >= 1 && valueIsLessThanNodeKey) {
				node.key[i] = node.key[i - 1];
				i--;
			}
			count ++;
			node.key[i] = value;
			node.numberOfNodes++;
		} else {
			while (i >= 1 && valueIsLessThanNodeKey) {
				i--;
			}
			i++;
			if (node.children[i - 1].numberOfNodes == 3) {
				splitChild(node, i, node.children[i - 1]);
				if (valueIsLessThanNodeKey = false) {
					i++;
				}
			}
			insertNonfull(node.children[i - 1], value);
		}
	}
	//splitting if leaf is full
	public void splitChild(Node parentNode, int childIndex, Node newChild) {
		Node temp = new Node();
		temp.isLeaf = newChild.isLeaf;
		temp.numberOfNodes = 1; 
		temp.key[0] = newChild.key[2];

		if (!newChild.isLeaf) {
			temp.children[1] = newChild.children[3];
			temp.children[0] = newChild.children[2];
		}
		newChild.numberOfNodes = 1; 

		for (int j = parentNode.numberOfNodes + 1; j >= childIndex + 1; j--) {
			parentNode.children[j] = parentNode.children[j - 1];
			parentNode.key[j - 1] = parentNode.key[j - 2];
		}
		parentNode.children[childIndex] = temp;
		parentNode.key[childIndex - 1] = newChild.key[1];
		parentNode.numberOfNodes++;
	}


	public boolean search(String file) {
		found = false;
		Node x = root;
		return search(x, file);
	}
	//helper for search
	public boolean search(Node node, String value) {
		if(found == true) {
			return true;
		}
		for (int i = node.numberOfNodes-1; i >= 0; i--) {
			if (!node.isLeaf){
				search(node.children[i], value);
			}
			if(node.key[i].equalsIgnoreCase(value)) {
				found = true;
				return true;
			}
			if (!node.isLeaf){
				search(node.children[node.numberOfNodes], value);
			}
		}
		return found;
	}
	
	public String searchedKey(String fileName){
		Node x = root;
		return searchedKey(x, fileName);
	}
	//helper for searchedKey
	public String searchedKey(Node node, String value) {
		if(!file.equals(""))
			return file;
		for (int i = node.numberOfNodes-1; i >= 0; i--) {
			if (!node.isLeaf){
				searchedKey(node.children[i], value);
			}
			if(node.key[i].equalsIgnoreCase(value)) {
				file = node.key[i];
				return file;
			}
			if (!node.isLeaf){
				searchedKey(node.children[node.numberOfNodes], value);
			}
		}
		return file;
	}

	public void print() {
		printTree(root, "");
	}
	//helper for print()
	public void printTree(Node node, String indent) {
		if (node == null) {
			System.out.println(indent + "The B-Tree is Empty");
		} else {
			System.out.println(indent + " ");
			String childIndent = indent + "\t";
			for (int i = node.numberOfNodes-1; i >= 0; i--) {
				if (!node.isLeaf){
					printTree(node.children[i], childIndent);
				}
				if(node.key[i].compareTo("") > 0)
					System.out.println((childIndent) + node.key[i]);
					//System.out.println(childIndent + node.key[i]+ " Is a leaf: "+node.isLeaf);
			}
			if (!node.isLeaf){
				printTree(node.children[node.numberOfNodes], childIndent);
			}
		}
	}
	
	public int returnCount() {
		return count;
	}
}