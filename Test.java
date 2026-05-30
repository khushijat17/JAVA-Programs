import java.io.Console;

public class Test {
    public static void main(String[] args) {

        Console c = System.console();

        String name = c.readLine("Enter your name: ");
        char[] pass = c.readPassword("Enter password: ");

        System.out.println("Name: " + name);
        System.out.println("Password: " + String.valueOf(pass));
    }
}