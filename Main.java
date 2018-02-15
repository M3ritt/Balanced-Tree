import java.util.ArrayList;
public class Main{

    public static void main(String[] args){
//<<<<<<< HEAD
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
//=======
        User test = new User();
        User secondTest = new User("John Doe", "TestPassword2");

        test.setUserName("Jane Doe");
        test.setPassword("TestPassword1");

        System.out.println("First test username: " + test.getUserName());
        System.out.println("Second test username: " + secondTest.getUserName());
        System.out.println("Passwords in order: " + test.getPassword() + ", " + secondTest.getPassword());
//>>>>>>> 2a57c8a34aeafc30ebf49b9e799a8a038ff904d9
    }
}