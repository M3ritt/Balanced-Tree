import java.util.Scanner;

public class User{

    //Field Summary
    String userName;
    String password;
    Scanner sc = new Scanner(System.in);
    String input;
    Boolean isValid;

    //Constructor
    public User(String userName){

        this.userName = userName;

    }

    public void setPassword(String password){

        System.out.println("Please input the password you would like.(It must meet minimal security specification)");
        input = sc.nextLine();
        isValid = false;
        while(isValid == false){
            if(input.length() > 8)
                System.out.println("Sorry password must be longer. Please try again.");
            else{
                System.out.println("Your new password is set.");
                isValid = true;
            }
        }
    }

    public String getPassword(){

        return password;

    }

}