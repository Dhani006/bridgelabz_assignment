package dhani;
import java.util.*;
public class LoginSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";

        int attempts = 0;
        boolean success = false;

        do {
            System.out.print("Enter username: ");
            String u = sc.next();
            System.out.print("Enter password: ");
            String p = sc.next();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful!");
                success = true;
                break;
            } else {
                System.out.println("Invalid credentials!");
                attempts++;
            }
        } while (attempts < 3);

        if (!success) {
            System.out.println("Account Locked! Too many failed attempts.");
        }

	}

}
