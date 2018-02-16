import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.util.Scanner;
public class Main{

    public static void main(String[] args){
/*//<<<<<<< HEAD
        // User test = new User("test");

        // test.setPassword();

        // System.out.println(test.getPassword());
		
		ArrayList<Item> testInv = new ArrayList<Item>();
		Item testItem = new Item("peach", 3.4);
		Item testItem2 = new Item("apple", 3.6);
		
		Inventory quiz = new Inventory(testInv);
		quiz.addItem(testItem);
		quiz.addItem(testItem2);
		
		System.out.println("Inventory count: " + quiz.getCount());
		quiz.getItems();
//=======
        User test = new User();
        User secondTest = new User("John Doe", "TestPassword2");

        test.setUserName("Jane Doe");
        test.setPassword("TestPassword1");

        System.out.println("First test username: " + test.getUserName());
        System.out.println("Second test username: " + secondTest.getUserName());
        System.out.println("Passwords in order: " + test.getPassword() + ", " + secondTest.getPassword());
//>>>>>>> 2a57c8a34aeafc30ebf49b9e799a8a038ff904d9
*/

        Scanner sc = new Scanner(System.in);
        SAXParserFactory spf = SAXParserFactory.newInstance();
        
        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();
        
        try{
            InputStream xmlInput = new FileInputStream(fileName);
            SAXParser saxParser = spf.newSAXParser();
            InventoryParser ixmlp = new InventoryParser();
            saxParser.parse(xmlInput, ixmlp);

        }
        catch(SAXException|ParserConfigurationException|IOException e){
            e.printStackTrace();
        }
    }
}