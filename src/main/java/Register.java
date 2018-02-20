import java.util.ArrayList;

public class Register {

	private Item temp = new Item();
	//private ArrayList<Item> iList;
	private Inventory inventory;
	
	//For the register do we want it to load all inventories or just the inventory of a certain department? If so we would could have a couple different
	//constructors in order to change it. I.E. (One constructor takes no inventory, one takes one, the other takes arrarylist of inventories, maybe
	// a hashmap. 
	
	public Register(Inventory inventory) {
		this.inventory = inventory;
	}
	
}
