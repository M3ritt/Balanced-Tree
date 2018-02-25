package App;


import java.util.ArrayList;
public class Inventory {
	//Some data structure to save the items... some type of array?
	//Generic for items
	private ArrayList<Item> iList;
	private int count = 0;
	private int tempItemCount;
	private String temp;
	
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
	
	public void removeItem(Item item) {
		iList.remove(item);
		
	}
	
	public void getItems(){
		for(Item i: iList)
			System.out.println(i);
	}
	
	public Item get(Item item) {
			temp = item.getName();
				for(Item i : iList) {
					if(temp.equals(i.getName())) {
						item = i;
						return item;
					}
					else
						continue;
				}
		return null;	
	}
}