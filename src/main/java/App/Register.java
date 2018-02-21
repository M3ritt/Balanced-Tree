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
	
	//For the register do we want it to load all inventories or just the inventory of a certain department? If so we would could have a couple different
	//constructors in order to change it. I.E. (One constructor takes no inventory, one takes one, the other takes arrarylist of inventories, maybe
	// a hashmap. 
	
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