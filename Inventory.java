import java.util.ArrayList;
public class Inventory {
	//Some data structure to save the items... some type of array?
	//Generic for items
	private ArrayList<Item> iList;
	private int count = 0;
	
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
		for(int i=0;i<count;i++){
			System.out.println(iList.get(i));
		}
	}
}