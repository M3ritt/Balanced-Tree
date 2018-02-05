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

    public void setPassword(){
        
        isValid = false;
        do{
            System.out.print("Please input the password you would like. ");
            input = sc.next();

            System.out.println(input);

            if(input.length() <= 7)
                System.out.println("Sorry password must be longer. Please try again.");
            else{
                System.out.println("Your new password is set.");
                isValid = true;
                password = input;
            }
        }
        
        while(isValid == false);
        
        
    }

    public String getPassword(){

        return password;

    }

}