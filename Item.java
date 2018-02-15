public class Item {
	private String itemName;
	private double price;
	private int numSold;
	//Could convert this to a hashmap

	public Item(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}

	public String getName() {
		return this.itemName;
	}

	public double getPrice() {
		return this.price;
	}

	public void changePrice(double newPrice) {
		this.price = newPrice;
	}

	@Override
	public String toString() {
		return this.itemName + " " + this.price + ".";
	}
}