package package1;
    import java.util.Scanner;

public class loginpw {
    public static void main(String[] args) {

        String correctUsername = "Sumit";
        String correctPassword = "Sumit@123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }

        scanner.close();
    }
}
