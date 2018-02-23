package App;

public class Item {
	private String itemName;
	private double price;
	private int itemCount;
	//Could convert this to a hashmap

	public Item(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public Item() {
		itemName = "";
		price = 0.0;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getName() {
		return this.itemName;
	}
	
	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	@Override
	public String toString() {
		return "Item: "+ this.itemName + " Price: " + this.price + ".";
	}
}