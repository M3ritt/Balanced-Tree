public class Main{

    public static void main(String[] args){
        User test = new User("test");

        test.setPassword();

        System.out.println(test.getPassword());
    }
}