import java.util.ArrayList;
public class Main{

    public static void main(String[] args){
        // User test = new User("test");

        // test.setPassword();

        // System.out.println(test.getPassword());
		
		ArrayList<Item> testInv = new ArrayList<Item>();
		Item testItem = new Item("peach", 3.4);
		Item testItem2 = new Item("apple", 3.6);
		
		Inventory test = new Inventory(testInv);
		test.addItem(testItem);
		test.addItem(testItem2);
		
		System.out.println("Inventory count: "+test.getCount());
		test.getItems();
    }
}