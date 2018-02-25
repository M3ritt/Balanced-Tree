package App;

//import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Register {

	private Item itemTemp = new Item();
	//private ArrayList<Item> iList;
	private Inventory inventory;
	private double dailySalesTotal, saleTotal, amountGiven, changeDue, taxRate;
	private Scanner sc = new Scanner(System.in);
	private String temp;
	public DecimalFormat df = new DecimalFormat("#.##");
	
	
	public Register(Inventory inventory) {
		this.inventory = inventory;
		this.taxRate = 1.08;
	}
	
	public void sale() {
		System.out.print("Please enter an item to sell: ");
		itemTemp.setName(sc.nextLine());
		itemTemp = inventory.get(itemTemp);
		dailySalesTotal += itemTemp.getPrice();
		saleTotal += itemTemp.getPrice();
		saleTotal = saleTotal * taxRate;
		System.out.print("Would you like to add another item?");
		temp = sc.nextLine();
		temp.toLowerCase();
		if(temp == "yes")
			sale();
		System.out.println("Amount Due: " + df.format(saleTotal) + ".");
		System.out.print("Amount taken: ");
		temp = sc.nextLine();
		amountGiven = Double.parseDouble(temp);
		changeDue = amountGiven - saleTotal;
		System.out.println("Customer Change: " + df.format(changeDue) + ".");
		saleTotal = amountGiven = changeDue = 0.0;
	}
	
	public void checkInventory() {
		//for(Item i: inventory) {
			//This needs to get the index of the first instance of each item, then store those indexes somewhere, get the items and then use item.getItemCount();
		//}
	}
	
	public void itemReturn() {
		System.out.println("Please enter an item to return: ");
		itemTemp.setName(sc.nextLine());
		System.out.println("Please enter the price of what is being returned: ");
		temp = sc.nextLine();
		itemTemp.setPrice(Double.parseDouble(temp));
		inventory.addItem(itemTemp);
		changeDue = itemTemp.getPrice() * taxRate;
		System.out.println("Item returned total due back to customer is: " + changeDue + ".");
		dailySalesTotal -= itemTemp.getPrice();
		changeDue = 0.0;
	}
	
	public void dailyInventory() {
		//This will go through and get the inventory for each item at the end of the day
	}
	
	public void weeklyInventory() {
		//This will check the inventory at the end of the week
	}
	
	public void dailySalesTotals() {
		System.out.println(dailySalesTotal);
	}
	
	public void weeklySalesTotals() {
		//This will get the weekly sales totals
	}
	
	public void dailyReport() {
		//This will give daily report for sales, inventory, total tax, and user metrics
	}
	
	public void weeklyReport() {
		//This will give the weekly report for sales, inventory, total tax, and user metrics.
	}

	public double getDailySalesTotal() {
		return dailySalesTotal;
	}

	public void setDailySalesTotal(double dailySalesTotal) {
		this.dailySalesTotal = dailySalesTotal;
	}

	public double getSaleTotal() {
		return saleTotal;
	}

	public void setSaleTotal(double saleTotal) {
		this.saleTotal = saleTotal;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	
}