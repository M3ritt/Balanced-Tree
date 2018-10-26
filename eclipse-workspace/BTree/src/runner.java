import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class runner {

	public static void main(String [] args) throws IOException {
		Tree tree = new Tree();
		Scanner in = new Scanner(System.in);
		Scanner other = new Scanner(System.in);
		ArrayList<String> treeList = new ArrayList<String>();
		ArrayList<String> alreadyAdded = new ArrayList<String>();
		System.out.print("insert: to insert a file to the B Tree.\n"
				+ "search: to search the B Tree.\n"
				+ "print: to print the B Tree.\n"
				+ "insert random: add large amounts of random files. \n"
				+ "return count: get count of keys in tree \n"
				+ "return file: return specific file. \n" 
				+ "options: view options again. \n"
				+ "insertToFile: inserts file names into a file. \n"
				+ "exit: exit the program. \n");
		int num;
		String key, choose = "";
		while (!choose.equalsIgnoreCase("exit")) {
			choose = in.nextLine();
			switch (choose) {
			case "insert":
				System.out.print("Enter the file to insert in the B tree: ");
				String name = other.next();
				//treeList.add(name);
				tree.insert(name);
				alreadyAdded.add(name+ "		");
				System.out.println("File was entered");
				break;
			case "search":
				System.out.print("Enter the file to search the B tree for: ");
				key = other.next();
				if (tree.search(key)) {
					System.out.println(key + " is found in the tree");
				} else {
					System.out.println(key + " is not found in the tree");
				}
				break;
			case "print":
				System.out.println("-------\n"
						+ "Printing The B Tree with count of: " + tree.returnCount() + "\n");
				tree.print();
				break;
			case "insert random": //xxxxxxxmmddyyhhmmss.ccccccc
				//x = patient ID	mmddyy = month, day, year	hhmmss = hours, minutes, seconds	c = image file
				System.out.println("How many files do you want generated?");
				num = other.nextInt();
				int leftLimit = 97; // letter 'a'
				int rightLimit = 122; // letter 'z'
				int targetStringLength = 19;
				int stringAfterDot = 7;
				String generatedString = "";
				String temp = "";
				for(int j = 0; j < num; j++) {
					Random random = new Random();
					for (int i = 0; i < targetStringLength; i++) {
						int randomLimitedInt = (int)(Math.random()*10);
						temp += Integer.toString(randomLimitedInt);
					}
					generatedString = "";
					generatedString = temp + ".";
					temp = "";
					StringBuilder buffer2 = new StringBuilder(stringAfterDot);
					for (int i = 0; i < stringAfterDot; i++) {
						int randomLimitedInt = leftLimit + (int) 
								(random.nextFloat() * (rightLimit - leftLimit + 1));
						buffer2.append((char) randomLimitedInt);
					}
					generatedString += buffer2.toString();
					System.out.println(generatedString);
					treeList.add(generatedString + "	");
					alreadyAdded.add(generatedString+ "		");
					//tree.insert(generatedString);
				}
				System.out.println(num +" number of files were generated.");
				break;
			case "return count": 
				System.out.println(tree.returnCount() + " keys in the tree.");
				break;
			case "return file":
				System.out.print("Enter the file to search the B tree for: ");
				key = other.next();
				System.out.println("File: " + tree.searchedKey(key));
				break;
			case "insertToFile":
				createFile(treeList, alreadyAdded);
				System.out.println("File was made.");
				break;
			case "options":
				System.out.print("insert: to insert a file to the B Tree.\n"
						+ "search: to search the B Tree.\n"
						+ "print: to print the B Tree.\n"
						+ "insert random: add large amounts of random files. \n"
						+ "return count: get count of keys in tree \n"
						+ "return file: return specific file. \n" 
						+ "options: view options again. \n"
						+ "insertToFile: inserts file names into a file. \n"
						+ "exit: exit the program. \n");
				break;
			default:
				if(!choose.equals("exit"))
					System.out.println(choose + " not recognized. Entering loop again, pick another option");
			}
			if(!choose.equals("exit"))
				System.out.println("-----------------------\n Entering loop again, pick another option");
			else
				System.out.println("EXITING");
		}
		createFile(treeList, alreadyAdded);
	}

	private static void createFile(ArrayList<String> str, ArrayList<String> alreadyAdded) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Josh\\Desktop\\samplefile1.txt"));
		for(int i=0; i < str.size(); i++) {
			if(!str.contains(alreadyAdded.get(i)))
				writer.write(alreadyAdded.get(i));
			else
				str.add(alreadyAdded.get(i));
		}
		writer.close();
	}
}
