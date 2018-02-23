package App;


import java.util.ArrayList;
public class Inventory {
	//Some data structure to save the items... some type of array?
	//Generic for items
	private ArrayList<Item> iList;
	private int count = 0;
	private int tempItemCount;
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
		tempItemCount = newItem.getItemCount();
		newItem.setItemCount(++tempItemCount);
	}
	
	public void getItems(){
		for(Item i: iList)
			System.out.println(i);
	}
	
	public Item get(String name) {
		for(int i = 0; i <= iList.size(); i++) {
			temp = iList.get(i);
			if(temp.getName().equals(name)) {
				return temp;
			}
			else
				continue;
		}
		System.out.println("Sorry the item " + name + " is not in the inventory.");
		return null;
	}
}