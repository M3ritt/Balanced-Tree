package App;


import java.util.ArrayList;
public class Inventory {
	//Some data structure to save the items... some type of array?
	//Generic for items
	private ArrayList<Item> iList;
	private int count = 0;
	private Item temp;
	
	public Inventory(ArrayList<Item> iList) {
		this.iList = iList;
	}
	
	//gets the count of items in the inventory 
	public int getCount(){
		return count;
	}
	
	//adds a new item to the inventory
	public void addItem(Item newItem){
		iList.add(count, newItem);
		count++;
	}
	
	public void getItems(){
		for(Item i: iList)
			System.out.println(i);
	}
	
	public Item get(Item item) {
		if(iList.contains(item) == true) {
			for(int i = 0; i <= iList.size(); i++) {
				temp = iList.get(i);
				if(temp.getName().equals(item.getName())) {
					return temp;
				}
				else
					continue;
			}
		}
		else {
			System.out.println("Sorry the item " + item.getName() + " is not in the inventory.");
			return null;
		}
		return null;
	}
	
}