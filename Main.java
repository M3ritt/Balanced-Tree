public class Main{

    public static void main(String[] args){
        User test = new User();
        User secondTest = new User("John Doe", "TestPassword2");

        test.setUserName("Jane Doe");
        test.setPassword("TestPassword1");

        System.out.println("First test username: " + test.getUserName());
        System.out.println("Second test username: " + secondTest.getUserName());
        System.out.println("Passwords in order: " + test.getPassword() + ", " + secondTest.getPassword());
    }
}