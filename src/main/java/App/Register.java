package App;

//import java.util.ArrayList;
import java.util.Scanner;

public class Register {

	private Item itemTemp = new Item();
	//private ArrayList<Item> iList;
	private Inventory inventory;
	private double dailySalesTotal, saleTotal, amountGiven, changeDue, taxRate;
	private Scanner sc = new Scanner(System.in);
	private String temp;
	
	
	public Register(Inventory inventory) {
		this.inventory = inventory;
		this.taxRate = .08;
	}
	
	public void sale() {
		System.out.println("Please enter an item to sell: ");
		itemTemp.setName(sc.nextLine());
		itemTemp = inventory.get(itemTemp);
		dailySalesTotal += itemTemp.getPrice();
		saleTotal += itemTemp.getPrice();
		System.out.println("Would you like to add another item?");
		temp = sc.nextLine();
		temp.toLowerCase();
		if(temp == "yes")
			sale();
		System.out.println("Amount Due: " + saleTotal*taxRate + ".");
		System.out.println("Amount taken: ");
		temp = sc.nextLine();
		amountGiven = Double.parseDouble(temp);
		changeDue = amountGiven - saleTotal;
		System.out.println("Customer Change: " + changeDue + ".");
	}
	
	public void checkInventory() {
		//for(Item i: inventory) {
			//This needs to get the index of the first instance of each item, then store those indexes somewhere, get the items and then use item.getItemCount();
		//}
	}
	
	public void itemReturn() {
		//This will return an item and increase the count of the item.
	}
	
	public void dailyInventory() {
		//This will go through and get the inventory for each item at the end of the day
	}
	
	public void weeklyInventory() {
		//This will check the inventory at the end of the week
	}
	
	public void dailySalesTotals() {
		//This will go through and get the sales totals for everything for the day
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